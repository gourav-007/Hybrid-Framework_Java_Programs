import java.util.Arrays;

class Sort{
  
    public static void sortZerosOnesAndTwo(int[] arr){
        int left=0,right=arr.length-1;
        int current=0;

        while (current<=right) {
            if (arr[current] == 0) {
                int temp = arr[left];
                arr[left] = arr[current];
                arr[current] = temp;

                left++;
                current++;

            } else if (arr[current] == 2) {
                int temp = arr[current];
                arr[current] = arr[right];
                arr[right] = temp;

                right--;
            }
            else {
                current++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {0,1,2,2,1,0};
        sortZerosOnesAndTwo(arr);
    }
}
