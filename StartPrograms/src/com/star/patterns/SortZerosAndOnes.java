import java.util.Arrays;

class TestClass{

    public static void sortZerosAndOnes(int [] arr){
        int left=0,right=arr.length-1;
        while (left<right){

            if(arr[left]==1){
                if (arr[right]!=1) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                right--;
            }else left++;
        }
        System.out.println(Arrays.toString(arr));
      
          public static void main(String[] args) {
        int [] arr = {0,1,2,2,1,0};
        sortZerosOnesAndTwo(arr);
    }
