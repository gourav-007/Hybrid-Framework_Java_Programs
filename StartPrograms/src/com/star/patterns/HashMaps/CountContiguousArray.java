import java.util.HashMap;

class CountContiguousArray {

    public static int countContiguousArray(int[]arr){
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                sum+=-1;
            }else {
                sum+=1;
            }

            if (map.containsKey(sum)){
                ans+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,1,0,1,1};
        System.out.println(countContiguousArray(arr));
    }
}
