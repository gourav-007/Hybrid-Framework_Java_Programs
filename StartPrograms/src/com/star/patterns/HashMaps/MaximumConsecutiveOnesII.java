
class MaximumConsecutiveOnesII {
//maximum number of consecutive 1's in the given array if you can flip at most one zero.
    public static int maximumConsecutiveOnesII(int[]arr){
        int ans=0;
        int j=-1;
        int count=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                count++;
            }

            while (count>1){
                j++;
                if (arr[j]==0){
                    count--;
                }
            }
            int len = i-j;
            if (len>ans){
                ans=len;
            }
        }
        return ans;

    }
    
    public static void main(String[] args) {
        int [] arr = {1,1,0,0,1,1};
        System.out.println(maximumConsecutiveOnesII(arr));
    }

}
