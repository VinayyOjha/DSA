public class CheckPrime{
    public static void main(String[] args) {
        System.out.println(isPrime_Otimal(70));
    }

    public static boolean isPrime_Otimal(int n) {
        for(int i = 2; i < Math.sqrt(n); i++){ 
            if (n % i == 0) return false;
        }
        return true;
    }
    public static boolean isPrime_Brute(int n) {
        for(int i = 2; i < n; i++){ 
            if (n % i == 0) return false;
        }
        return true;
    }
}