import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {7,8,388,1,2};
        System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < arr.length ; i++){
            for( int j = 0 ; j < arr.length - i -1 ; j++){
                if( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Bubble sort");
        System.out.println( " -------> " + Arrays.toString(arr));
    }
}
