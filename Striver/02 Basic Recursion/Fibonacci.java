public class Fibonacci {
    public static void main(String args[]){
        int n = 10;
        System.out.println(fibonacciOf(n));
    }

    public static int fibonacciOf(int n){
        if (n == 1 || n == 0) return n;

        return helper(0, 1, n - 1);
    }

    public static int helper(int a, int b, int n){
        if (n <= 0) return b;
        return helper(b, a + b, n - 1);
    }
}