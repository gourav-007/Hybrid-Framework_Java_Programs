import java.util.Arrays;

class BubbleSort{

    public static void bubblesort(int [] arr){
        //For N values we have N-1 Iterations.
        for (int itr=1;itr<=arr.length-1;itr++){
            for (int j=0;j< arr.length-itr;j++){
                if (isSmaller(arr,j+1,j)){
                    doswap(arr,j+1,j);
                }
            }
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
        bubblesort(arr);
    }
}
