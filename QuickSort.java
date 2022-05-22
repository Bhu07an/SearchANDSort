import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {9,2,54,1,5,2,3};
        int[] ardr = new int[6];
        Quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public  static void Quicksort(int[] arr , int l , int h){
        if(l < h){
            int pivot = Particion(arr,l,h);
            Quicksort(arr,l,pivot-1);
            Quicksort(arr,pivot+1,h);
        }
    }

    public static int Particion(int[] arr, int l , int h){
        int pivot = arr[l];
        int i = l;
        int j = h;

        while(i < j) {

            while (arr[i] <= pivot) {
                i++;

            }

            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, l , j);

        return j;

    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;
    }
}
