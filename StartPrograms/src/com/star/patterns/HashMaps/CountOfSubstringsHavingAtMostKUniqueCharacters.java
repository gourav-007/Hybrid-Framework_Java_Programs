import java.util.HashMap;

class CountOfSubstringsHavingAtMostKUniqueCharacters {
//count Of Substrings Having At Most 'K' Unique Characters
    public static int countOfSubstringsHavingAtMostKUniqueCharacters(String s, int k){
        int ans=0;

        int i=-1;
        int j=-1;
        HashMap<Character,Integer> map = new HashMap<>();
        while (true){
            while (i<s.length()-1){
                i++;
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);

                if (map.size()<=k){
                    ans+=i-j;
                }else{
                    break;
                }
            }

            if (i==s.length()-1&&map.size()<=k){
                break;
            }

            while (j<i){
                j++;
                char ch = s.charAt(j);
                if (map.get(ch)==1){
                    map.remove(ch);
                }else {
                    map.put(ch,map.get(ch)-1);
                }

                if (map.size()>k){
                    continue;
                }else{
                    ans+=i-j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "aabcbcdbca";
        int k=2;
        System.out.println(countOfSubstringsHavingAtMostKUniqueCharacters(s, k));
    }

}
