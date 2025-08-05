
import java.util.Arrays;


public class BubbleSort{
    public static void main(String args[]){
        int arr[] = {9, 8, 1, 4, 6, 54, -100};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    System.out.print(arr[j] + " " + arr[j + 1]);
                    System.out.println();
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }   
}

