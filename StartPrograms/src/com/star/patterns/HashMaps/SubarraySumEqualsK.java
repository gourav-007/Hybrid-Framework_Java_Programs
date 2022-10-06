import java.util.HashMap;

class SubarraySumEqualsK {

    public static int countOfSubarraysHavingSumEqualsToK(int[]arr,int k){
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];

            if (map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,1};
        int k=2;
        System.out.println(countOfSubarraysHavingSumEqualsToK(arr,k));

    }
}
