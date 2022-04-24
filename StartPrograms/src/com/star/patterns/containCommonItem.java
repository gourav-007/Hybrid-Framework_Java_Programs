import java.util.*;
class containCommonItem{
    public static boolean isContainItem(int[] arr,int[] brr){
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){ //O(n)
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], true); //O(1)
            }
        }
        for(int i=0;i<brr.length;i++){ //O(n)
            if(map.containsKey(brr[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        System.out.println(isContainItem(new int[]{'a','b','c','x'},new int[]{'z','y','x'}));
    }
}
}