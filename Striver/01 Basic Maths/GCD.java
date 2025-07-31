

public class GCD{
    public static void main(String[] args) {
        System.out.println(GCD_OptimalApproach(100,40));
    }

    public static int GCD_BetterApproach(int n1, int n2) {

        for (int i = Math.min(n1, n2); i > 0; i--){
            if (n2 % i == 0 && n1 % i == 0) return i;
        }
        return -1;
    }

    // Euclidean algorithm
    public static int GCD_OptimalApproach(int n1, int n2){
       if (n2 == 0) return n1;
    
        return GCD_OptimalApproach(n2, n1 % n2);
    }
}