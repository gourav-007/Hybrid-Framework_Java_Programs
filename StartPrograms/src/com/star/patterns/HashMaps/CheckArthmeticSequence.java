import java.util.HashSet;

class CheckAP {

    public static boolean canMakeArithmeticProgression(int[]arr){

        int min  = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();

        for (int val : arr){
            min = Math.min(val,min);
            max = Math.max(val,max);

            set.add(val);
        }

        if (set.size()==1){
            return true;
        }

        int d = (max-min)/(arr.length-1);

        if(d<1){
            return false;
        }

        for (int i=0;i<arr.length;i++){
            int aith = min+i*d;
            if (!set.contains(aith)){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
      int[] arr = {3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}
