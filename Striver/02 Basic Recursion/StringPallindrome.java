public class StringPallindrome{
    public static void main(String args[]){
        String s = "1111";
        System.out.println(stringPallindrome(s, 0, s.length() - 1));
    }

    public static boolean stringPallindrome(String s, int a, int b){
        if (a >= b) return true;
        if (s.charAt(a) != s.charAt(b)) return false;

        return stringPallindrome(s, a + 1, b - 1);
    }
}