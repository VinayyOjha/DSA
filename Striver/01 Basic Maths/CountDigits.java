class CountDigits{
    public static void main(String args[]){
        System.out.println(CountDigits(787636));
    }

    public static int CountDigits(int n){
        int res = 0;
        while(n != 0){
            n = n/10;
            res++;
        }

        return res;
    }
}
/*
 ->  BRUTE-FORCE-
    Simply run a loop untill n is greater than zero. And as many times the loops runs, will be our answer.


 ->  OPTIMAL APPROACH-
    We can simply use a log function(with base 10) here.
    Our o/p will be [(by how much should we raise the power of 10 to get n) + 1]     
 */