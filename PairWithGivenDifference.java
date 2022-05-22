import java.util.Arrays;

public class PairWithGivenDifference {
    public static void main(String[] args){
        int[] arr = {5, 20, 3, 2, 5, 80};
        int x = 78;
        System.out.println(Ispresent(arr,x));
    }
    public static boolean Ispresent(int[] arr, int x){

        Arrays.sort(arr);                                       // main motive ( we add x with very element in array if find sum is present in  array means it contain diff pair wiht equal to x)

        for(int i = 0; i < arr.length ; i++){
            int sum = arr[i] + x;
             if(BinarySearch(arr,sum)){
                 return true;
             }
        }

        return false;
    }

    public static boolean BinarySearch(int arr[] , int x){
        int low = 0;
        int high  = arr.length -1;

        while( low <= high){

            int mid = (low + high) / 2;

            if( arr[mid] == x){
                return true;
            }

            if( x > arr[mid] ){
                low = mid+1;
            }

            else{
                high  = mid - 1;
            }
        }

        return false;
    }


}

   /*
    public boolean findPair(int arr[], int size, int n)                // (on)
    {
        HashSet<Integer> set  = new HashSet<Integer>();
        for(int i = 0 ;  i < size ; i++){
            set.add(arr[i]);
        }

        for(int j = 0 ; j < size ; j++){
            int sum = n + arr[j];
            if(set.contains(sum)){
                return true;
            }
        }
        return false;
    }
}
*/




 /* for(int i = 0 ; i < size ; i++){                            // O(N2)
            for(int j = i  ; j < size ; j++){
                int diff = arr[i] - arr[j];
                if( diff == n  || diff == -(n) ){
                    return true;
                }
            }
        }
        return false;  */
