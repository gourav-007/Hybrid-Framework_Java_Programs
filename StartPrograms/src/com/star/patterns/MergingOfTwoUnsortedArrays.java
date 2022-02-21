public static void mergeArrays(int [] a, int [] b, length_a, length_b)
{
  
  Map<Integer,Boolean> map = new TreeMap<>();
  
  for(int i=0;i<length_a;i++){
    map.put(Integer,true);
  }
  
  for(int i=0;i<length_b;b++){
    map.put(Integer,true);
  }
  
  for(Map.entrySet<Integer,Boolean> entryset : map.entrySet()){
    System.out.print(entrySet.getKey() + " ");
  }
  
}

public static void main(String[]args)
{
  int a[] = {3,4,5};
  int b[] = {0,1,2};
  
  int length_a = a.length;
  int length_b = b.length;
  
  mergeArrays(a, b, lengtha, lengthb)
}
