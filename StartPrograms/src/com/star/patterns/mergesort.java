import java.util.Arrays;

class TestClass{

    public static int[] mergesort(int[] arr, int low, int high){
        if (low==high){
            int [] basearray = new int[1];
            basearray[0] = arr[low];
            return basearray;
        }

        int mid = (low+high)/2;

        int[] fisrthalf = mergesort(arr, low, mid);
        int[] secondhalf = mergesort(arr, mid + 1, high);
        int[] fullsortedarray = mergetwosortedarray(fisrthalf, secondhalf);

        return fullsortedarray;
    }

    public static int[] mergetwosortedarray(int [] a, int [] b){
        int [] res = new int[a.length+b.length];

        int i=0;
        int j=0;
        int k=0;

        while (i< a.length && j<b.length){
            if (a[i]<b[j]){
                res[k] = a[i];
                i++;
                k++;
            }else {
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while (i<a.length){
            res[k] = a[i];
            i++;
            k++;
        }
        while (j<b.length){
            res[k] = b[j];
            j++;
            k++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {19, 173, 392, 741, 821};
        int[] b = {346, 389, 837, 880, 940};
        System.out.println(Arrays.toString(mergetwosortedarray(a, b)));
    }
}
