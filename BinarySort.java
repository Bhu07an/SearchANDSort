public class BinarySort {
    public static void main(String[] args){
        int[] arr = {110,120,60,70,80,90,100};
        int x = 90;
        System.out.println(Sort(arr,x));
    }

    public static int Sort(int[] arr , int x){                   // ITERATION SOLUTION (LOOPS)

        int l = 0;
        int r = arr.length-1;

        while( l <= r){

            int mid = (l+r) / 2;

            if( arr[mid] == x){
                return mid;
            }

            if( arr[mid] > x){
                r = mid -1;
            }
            else{
                l = mid +1;
            }

        }
        return -1;
    }
}
