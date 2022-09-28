import java.util.HashMap;
import java.util.HashSet;

//Smallest Substring Of A String Containing All Unique Characters Of Itself

class MiniumWindowSubstring2 {

    public static int miniumWindowSubstring2(String s){
        int len=s.length();
        HashSet<Character> set = new HashSet<>();
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            set.add(ch);
        }

        int i=-1;
        int j=-1;
        HashMap<Character,Integer> map =new HashMap<>();
        while (true){
            boolean f1= false;
            boolean f2=false;
            //acquire till map.size() < set.size();
            while (i<s.length()-1 && map.size()< set.size()){
                i++;
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);

                f1=true;
            }

            //collect and release
            while (j<i && map.size()== set.size()){
                int potencialLength = i-j;
                if (potencialLength<len){
                    len = potencialLength;
                   }
                j++;
                char ch = s.charAt(j);
                if (map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
                f2=true;
            }

            if (f1==false&&f2==false){
                break;
            }

        }
        return len;
    }

    public static void main(String[] args) {
        String s = "aabcbcdbca";
        System.out.println(miniumWindowSubstring2(s));
    }

}
