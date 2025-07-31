public class Factorial{
    public static void main(String args[]){
        System.out.println(numFactorial(5));
    }

    public static Double numFactorial(int n){
        if(n == 1) return 1.0;

        return n * numFactorial(n - 1);
    }
}