class CountDigits{
    public static void main(String args[]){
        Solution s = new Solution();
        System.out.println(s.CountDigits(787636));
    }
}

class Solution{
    public int CountDigits(int n){
        int res = 0;
        while(n != 0){
            n = n/10;
            res++;
        }

        return res;
    }
}