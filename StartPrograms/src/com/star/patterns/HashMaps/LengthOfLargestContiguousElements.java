import java.util.HashSet;

class TestClass {

    public static int lengthOfLargestContiguousElements(int [] arr){
        int ans =0;
        for (int i=0;i<arr.length-1;i++){
            int min = arr[i];
            int max= arr[i];
            HashSet<Integer> set = new HashSet<>();
            set.add(arr[i]);

            for (int j=i+1;j<arr.length;j++){
                if (set.contains(arr[j])){
                    break;
                }else set.add(arr[i]);

                min = Math.min(min,arr[j]);
                max = Math.max(max,arr[j]);

                if (max-min==j-i){
                    int len = j-i+1;
                    if (len>ans) {
                        ans = len;
                    }
                }
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int[]arr = {9,2,7,5,6,23,24,22,23,19,17,16,18,29,0};
//        int[]arr={10,12,11};
        System.out.println(lengthOfLargestContiguousElements(arr));
    }

}
