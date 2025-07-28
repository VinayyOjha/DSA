public class CheckPallindrome {
    public static void main(String args[]){
        System.out.println(isPalindrome(6116));
    }

    public static boolean isPalindrome(int n) {
        int res = 0;
        int temp = n;

        while(temp > 0 ){
            res = res * 10 + (temp % 10);
            temp /= 10;
        }
        System.out.println(res);
        return res == n;
    }
}
