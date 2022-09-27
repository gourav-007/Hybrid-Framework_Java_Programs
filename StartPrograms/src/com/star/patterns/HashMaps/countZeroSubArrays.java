import java.util.HashMap;

class TestClass {

    public static int countZeroSubArrays(int[]arr){

        HashMap<Integer,Integer> map = new HashMap<>(); //frequency map
        int i=-1;
        int sum=0;
        int count =0;
        map.put(0,1);

        while (i<arr.length-1){
            i++;
            sum+=arr[i];

            if (map.containsKey(sum)){
                count+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            } else {
                map.put(sum,1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(countZeroSubArrays(arr));
    }

}
