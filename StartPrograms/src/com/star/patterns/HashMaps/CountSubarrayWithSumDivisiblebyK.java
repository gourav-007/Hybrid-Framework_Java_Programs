import java.util.HashMap;

class CountSubarrayWithSumDivisiblebyK {

    public static int countSubarrayWithSumDivisiblebyK(int[] arr, int k){
        int ans=0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int rem=0;

        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            rem=sum%k;

            if (rem<0){
                rem+=k;
            }

            if (map.containsKey(rem)){
                ans+=map.get(rem);
                map.put(rem, map.get(rem)+1);
            }else {
                map.put(rem,1);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int [] arr = {2,7,6,1,4,5};
        int k=3;
        System.out.println(countSubarrayWithSumDivisiblebyK(arr,k));

    }
}
