
import java.util.ArrayList;
import java.util.Arrays;



public class AllDivisors{
    public static void main(String arg[]){
        System.out.println(Arrays.toString(divisors(198592)));
    }

    public static  int[] divisors(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        int[] res = list.stream().mapToInt(Integer::intValue).toArray();
        
        return res;
    }
}