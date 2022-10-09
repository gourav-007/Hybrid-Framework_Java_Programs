import java.util.HashMap;

class RecurringSequenceInAFraction {

    public static String recurringSequenceInAFraction(int numerator,int denominator){

        if (numerator==0){
            return "0";
        }

        StringBuilder ans = new StringBuilder();
        ans.append((numerator>0)^(denominator>0)?"-":"");

        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);

        long q = num/den;
        long r = num%den;
        ans.append(q);

        if (r==0){
            return ans.toString();
        }else{
            ans.append(".");
            HashMap<Long,Integer> map = new HashMap<>();
            while (r!=0){
                if (map.containsKey(r)){
                    int len = map.get(r);
                    ans.insert(len,"(");
                    ans.append(")");
                    break;
                }else {
                    map.put(r,ans.length());
                    r *= 10;
                    q = r / den;
                    r = r % den;
                    ans.append(q);
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
      int numerator = -1;
      int denominator = -2147483648;
        System.out.println(recurringSequenceInAFraction(numerator, denominator));
    }
}
