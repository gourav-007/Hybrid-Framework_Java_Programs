import java.util.ArrayList;
import java.util.HashMap;

class GroupAnagram {

    public static ArrayList<ArrayList<String>> groupAnagram(String[]s){

        if (s==null || s.length==0){
            return new ArrayList<>();
        }

        HashMap<HashMap<Character,Integer>,ArrayList<String>> bmap = new HashMap<>();
        for (String str:s){
            HashMap<Character,Integer> fmap = new HashMap<>();
            for (int i=0;i<str.length();i++) {
                char ch = str.charAt(i);
                fmap.put(ch, fmap.getOrDefault(ch,0)+1);
            }

            if (!bmap.containsKey(fmap)){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                bmap.put(fmap,list);
            }else{
                ArrayList<String> list = bmap.get(fmap);
                list.add(str);
            }

        }

        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for (ArrayList<String> val : bmap.values()){
            res.add(val);
        }

        return res;
    }

    public static void main(String[] args) {
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagram(s));
    }
}
