public class PrintN_num{
    public static void main(String args[]){
        OneToN(10);
        System.out.println();
        NToOne(10);
    }

    public static void OneToN(int n){
        if (n == 0) return;

        OneToN(n - 1);
        System.out.print(n + " ");
    }

     public static void NToOne(int n){
        if (n == 0) return;

        System.out.print(n + " ");
        NToOne(n - 1);
    }
}