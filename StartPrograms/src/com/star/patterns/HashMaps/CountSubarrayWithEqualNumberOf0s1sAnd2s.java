import java.util.HashMap;

class CountSubarrayWithEqualNumberOf0s1sAnd2s {

    public static int countSubarrayWithEqualNumberOf0s1sAnd2s(int[]arr){
        int ans=0;

        HashMap<String,Integer> map = new HashMap<>();
        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;

        String key = (countOnes-countZeros)+"#"+(countTwos-countOnes);
        map.put(key,1);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                countZeros++;
            } else if (arr[i]==1) {
                countOnes++;
            }else{
                countTwos++;
            }
            key = (countOnes-countZeros)+"#"+(countTwos-countOnes);
            if (map.containsKey(key)){
                ans+=map.get(key);
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,0,2,0,1,0};
        System.out.println(countSubarrayWithEqualNumberOf0s1sAnd2s(arr));
    }
}
