
import java.util.Arrays;


public class SelectionSort{
    public static void main(String args[]){
        int arr[] = {5, 9, 9, 6,1, -900};
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    // Selection Sort
    private static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[i]){
                    swap(arr, i, j);
                }
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
