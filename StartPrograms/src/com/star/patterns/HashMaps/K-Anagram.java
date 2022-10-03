import java.util.HashMap;

class KAnagram {

    /*
     1. You are given two strings s1, s2, and a number K.
     2. You have to find if two strings are K-anagrams of each other or not.
     3. Two strings are called K-anagrams if
      -> Both s1 and s2 have the same number of characters.
      -> After changing K characters in any string, s1 and s2 become anagram of each other.
     */

    private static boolean kanagrams(String s, String p, int k) {

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            if (map.getOrDefault(ch,0)>0) {
                map.put(ch, map.get(ch) - 1);
            }
        }

        int count=0;
        for (char ch : map.keySet()){
            count+=map.get(ch);
        }

        if (count>k){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        String s = "fodr";
        String p = "gork";
        int k =2;
        System.out.println(kanagrams(s, p, k));
    }
}
