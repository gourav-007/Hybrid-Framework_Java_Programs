import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

class AllAnagrams {

    /*
        1. You are given two strings s1 and s2.
        2. You have to find the count of s2's anagrams that are present in s1.
        3. Also, you have to return List of the start indices of such anagrams in s1.
     */

    public static void allAnagrams(String s, String p){
        List<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> pmap = new HashMap<>();

        for (int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            pmap.put(ch, pmap.getOrDefault(ch,0)+1);
        }

        for (int i=0;i<p.length();i++){
            char ch = s.charAt(i);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
        }

        int i=p.length();
        int count=0;


        while (i<s.length()){
            if (comparemap(pmap, smap)){
                count++;
                ans.add(i-p.length());
            }

            char cha = s.charAt(i);
            smap.put(cha, smap.getOrDefault(cha,0)+1);

            char chr = s.charAt(i-p.length());
            if (smap.get(chr)==1){
                smap.remove(chr);
            }else{
                smap.put(chr,smap.get(chr)-1);
            }
            i++;
        }

        if (comparemap(pmap,smap)){
            count++;
            ans.add(i-p.length());
        }

        System.out.println(count);
        System.out.println(ans);
    }

    private static boolean comparemap(HashMap<Character, Integer> pmap, HashMap<Character, Integer> smap) {
        for (char sch : smap.keySet()){
            if (!Objects.equals(pmap.getOrDefault(sch, 0), smap.get(sch))){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        allAnagrams(s,p);
    }

}
