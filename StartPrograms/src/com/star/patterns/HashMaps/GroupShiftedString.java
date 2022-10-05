import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class GroupShiftedString {

    public static List<List<String>> groupShiftedString(String[]strs){
        HashMap<String,List<String>> map = new HashMap<>();
        for (String str : strs){
            String key = getKeys(str);
            if (!map.containsKey(key)){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }else {
                List<String> list = map.get(key);
                list.add(str);
            }

        }

        List<List<String>> res = new ArrayList<>();
        for (List<String> val : map.values()){
            res.add(val);
        }

        return res;
    }

    private static String getKeys(String str) {
        String key="";

        for (int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int diff = curr-prev;

            if (diff<0){
                diff+=26;
            }

            key=key+diff+"#";
        }
        key=key+".";
        return key;
    }

    public static void main(String[] args) {
        String[] s = {"acd","dfg","wyz","yab","mop","bdfh","a","x","moqs"};
        System.out.println(groupShiftedString(s));

    }
}
