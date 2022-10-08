import java.util.HashSet;

class PairWithEqualSum {

    public static boolean pairSum(int[]arr){
        HashSet<Integer> set = new HashSet<>();

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                int sum  = arr[i] + arr[j];
                if (set.contains(sum)){
                    return true;
                }else{
                    set.add(sum);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {2,7,11,15,9,0};
        System.out.println(pairSum(arr));
    }
}
