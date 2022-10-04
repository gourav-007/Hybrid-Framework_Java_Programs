import java.util.HashMap;

class TestClass {

    public static boolean validAnagram(String s1, String s2){

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (int j=0;j<s2.length();j++){
            char ch = s2.charAt(j);

            if(map.containsKey(ch)==false){
                return false;
            }

            if (map.get(ch)==1){
                map.remove(ch);
            }else{
                map.put(ch, map.get(ch)-1);
            }
        }

        if (map.size()==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s1= "pepcoding";
        String s2 = "codingpep";
        System.out.println(validAnagram(s1, s2));
    }
}
