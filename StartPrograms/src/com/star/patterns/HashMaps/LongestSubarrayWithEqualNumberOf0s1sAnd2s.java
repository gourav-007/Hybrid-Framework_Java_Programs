import java.util.HashMap;

class LongestSubarrayWithEqualNumberOf0s1sAnd2s {

    public static int longestSubarrayWithEqualNumberOf0s1sAnd2s(int[]arr) {
        int ans=0;

        HashMap<String,Integer> map = new HashMap<>();
        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;

        int diffOnesAndZeros = countOnes-countZeros;
        int diffTwosAndOnes = countTwos-countOnes;
        String key = diffTwosAndOnes+"#"+diffOnesAndZeros;
        map.put(key,-1);

        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                countZeros++;
            } else if (arr[i]==1) {
                countOnes++;
            }else{
                countTwos++;
            }

            diffOnesAndZeros = countOnes-countZeros;
            diffTwosAndOnes = countTwos-countOnes;
            key = diffTwosAndOnes+"#"+diffOnesAndZeros;

            if (map.containsKey(key)){
                int idx = map.get(key);
                int len = i - idx;
                if (len>ans){
                    ans=len;
                }
            }else{
                map.put(key,i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,0,2,0,1,0};
        System.out.println(longestSubarrayWithEqualNumberOf0s1sAnd2s(arr));
    }
}
