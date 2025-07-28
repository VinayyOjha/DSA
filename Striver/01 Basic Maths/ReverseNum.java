public class ReverseNum {
	public static void main(String[] args) {
        System.out.println(reverseNumber(10400));
    }
    
    public static int reverseNumber(int n) {
        int res = 0;
        while (n > 0) {
            res = res * 10 + (n % 10);
            n /= 10;
        }
    
        return res;
    }
}