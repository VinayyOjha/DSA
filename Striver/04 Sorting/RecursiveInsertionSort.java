
import java.util.Arrays;

public class RecursiveInsertionSort{
    public static void main(String[] args){
        Swap s = new Swap();
        int[] arr = {5, 4, 3 ,2, 1};
        sortArray_Recursive(arr, 0, s);
        System.out.println(Arrays.toString(arr));
    }
    // Recursive
    public static void sortArray_Recursive(int arr[], int count, Swap s){
        if (count == arr.length) return;

        sortArray(arr, count, s);
        sortArray_Recursive(arr, count + 1, s);
    }

    public static void sortArray(int[] arr, int i, Swap s){
        int key = arr[i];
        int j = i;
        while (j > 0 && key < arr[j - 1]){
            s.swap(arr, j, j - 1);
            j--;
        }
    }

    // Non recursive
    public static void sortArray_NonRecursive(int arr[], Swap s){
        for (int i = 0; i < arr.length; i++){
            int key = arr[i];
            int j = i;
            while(j > 0 && key < arr[j - 1]){
                s.swap(arr, j, j - 1);
                j--;
            }
        }
    }
}
