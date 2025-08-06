
import java.util.Arrays;

public class RecursiveBubbleSort{
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        recursiveCall(arr, 1);
        System.out.print(Arrays.toString(arr));
    }
    public static void recursiveCall(int[] arr, int count){
        if (count == arr.length) return;

        int didSwap = sortArray(arr, 0, arr.length);
        if (didSwap == 0) return;
        recursiveCall(arr, count + 1);
    }
    public static int sortArray(int[] arr, int i, int n){
        if (i >= n - 1) return 0;

        int didSwap = 0;
        if (arr[i] >= arr[i + 1]) {
            swap(arr, i);
            didSwap = 1;
        }
        
        int restSwapped = sortArray(arr, i + 1, n);

        return didSwap | restSwapped;
    }

    public static void swap(int[] arr, int i){
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;

        
    }
}