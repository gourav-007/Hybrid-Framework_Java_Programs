import java.util.HashMap;

class TestClass {
//length Of Longest Substring with atmost K Distinct char
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int ans=0;
        int i=-1;
        int j=-1;
        HashMap<Character,Integer> map = new HashMap<>();
        while(true){
            boolean f1=false;
            boolean f2 =false;
            while(i<s.length()-1){
                f1=true;
                i++;
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);

                if(map.size()<=k){
                    int len = i - j;
                    if(len>ans){
                        ans=len;
                    }
                }else{
                    break;
                }
            }
            while(j<i){
                f2=true;
                j++;
                char ch = s.charAt(j);
                if(map.size()==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }

                if(map.size()>k){
                    continue;
                }else{
                    int len = i-j;
                    if(len>ans){
                        ans=len;
                    }
                }
            }

            if (!f1&&!f2){
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "eceba";
        int k=2;
        System.out.println(lengthOfLongestSubstringKDistinct(s, k));
    }

}
