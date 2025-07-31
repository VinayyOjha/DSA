public class Sum{
    public static void main(String args[]){
        sumusingRecursion(7, 0);
        System.out.print(NumberSum(7));
    }

    // Using void as return type
    public static void sumusingRecursion(int n, int sum){
        if (n == 0) {
            System.out.println(sum);
            return;
        }

        sumusingRecursion(n - 1, sum + n);
    }

    // Using int as return type
    public static int NumberSum(int n){
        if (n <= 0) return 0;

        return n + NumberSum(n - 1);
    }
}