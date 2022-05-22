import java.util.*;

public class SelectionSort {         // selection sort  (in this we find minimum and swap it to first // swapping is only done onces in each loop)
    public static void main(String[] args){
        int[] arr = {77,8,3884,1,772};

        for( int i = 0 ; i < arr.length ; i++){
            int min  = i;
            for( int j = i +1; j < arr.length ; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}