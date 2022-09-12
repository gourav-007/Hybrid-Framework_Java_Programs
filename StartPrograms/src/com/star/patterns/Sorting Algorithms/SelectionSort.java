
import java.util.Arrays;

class SelectionSort{

    public static void selectionsort(int [] arr){
        //For N values we have N-1 Iterations.
        for (int i=0;i<arr.length-1;i++){
            int min = i;
            for (int j=i+1;j < arr.length;j++){
                if (isSmaller(arr,j,min)){
                    min = j;
                }
            }
            doswap(arr,i,min);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void doswap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static boolean isSmaller(int[] arr, int i, int j) {
        return arr[i] < arr[j];
    }


    public static void main(String[] args) {
        int [] arr = {741, 392, 173, 821, 19};
        selectionsort(arr);
    }
}
