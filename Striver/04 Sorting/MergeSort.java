
import java.util.Arrays;

public class MergeSort{
    public static void main(String args[]){
        int arr[] = {9, 6, 1, 4, -10, 5};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr){
        mergeSort(arr, 0, arr.length - 1);
        merge(arr);
    }

    public static void mergeSort(int[] arr, int low, int high){
        if (low >= high) return;
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, arr.length - 1);

    }

    public static void merge(int[] arr){

    }
}
