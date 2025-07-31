public class Armstrong{
    public static void main(String[] args) {
        System.out.println(isArmstring(153000000));
    }

    public static boolean isArmstring(int num){
        int digits = (int)(Math.log10(num) + 1);
        int sum = 0, tmp = num;
        while(num != 0){
            sum += Math.pow(num %10, digits);
            num /= 10;
        }
        return sum == tmp;
    }
}