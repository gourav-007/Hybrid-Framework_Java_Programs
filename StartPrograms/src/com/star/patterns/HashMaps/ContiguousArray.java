import java.util.HashMap;

class ContiguousArray {

//return the maximum length of a contiguous subarray with an equal number of 0 and 1.

    public static int contiguousArray(int[]arr){
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                sum+=-1;
            }else {
                sum+=1;
            }

            if (map.containsKey(sum)){
                int idx = map.get(sum);
                int len = i-idx;
                if (len>ans){
                    ans=len;
                }
            }else{
                map.put(sum,i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,1,0,1,1};
        System.out.println(contiguousArray(arr));
    }
}
