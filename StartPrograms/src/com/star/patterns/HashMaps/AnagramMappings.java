import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class AnagramMappings {

    public static class Pair{
        int idex=0;
        ArrayList<Integer> al = new ArrayList<>();
    }

    private static int[] anagramsMapping(int[] arr1, int[] arr2) {
        HashMap<Integer,Pair> map = new HashMap<>();
        for (int i=0;i<arr2.length;i++){
            if (map.containsKey(arr2[i])){
                Pair p  = map.get(arr2[i]);
                p.al.add(i);
            }else {
                Pair p = new Pair();
                p.al.add(i);
                map.put(arr2[i],p);
            }
        }
        int[] ans = new int[arr1.length];
        for (int j=0;j<arr1.length;j++){
           Pair p = map.get(arr1[j]);
           ans[j] = p.al.get(p.idex);
           p.idex++;
        }

        return ans;
    }

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5,2};
        int [] arr2 = {4,3,2,1,5,2};

        System.out.println(Arrays.toString(anagramsMapping(arr1, arr2)));
    }



}
