import java.util.HashMap;

class RabbitsInForest {

    public static int rabbitInForest(int[]arr){
        if(arr.length==0){
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer val : arr){
            map.put(val, map.getOrDefault(val,0)+1);
        }

        int ans=0;
        for (int key : map.keySet()){
            int groupsize = key+1;
            int repotees = map.get(key);

            int numgroups = (int) Math.ceil(repotees * 1.0 / groupsize*1.0);

            ans+=numgroups*groupsize;

        }

        return ans;
    }


    public static void main(String[] args) {
      int[] arr = {1,0,1,0,0};
        System.out.println(rabbitInForest(arr));
    }
}
