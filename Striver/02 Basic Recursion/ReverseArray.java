
import java.util.Arrays;

public class ReverseArray{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArr(int[] arr){
        if (arr.length == 0 || arr.length == 1) return;
        helper(arr, 0, arr.length - 1); 
    }

    public static void helper(int[] arr, int a, int b){
        if (a >= b) return;

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        helper(arr, a + 1, b - 1);
    }
}