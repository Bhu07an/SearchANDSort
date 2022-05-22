public class FirsatAndLastIndexOccurBS {
    public static void main(String[] args){
        int[] arr = {2,7,11,2,2,2,3};
        int n = arr.length;
        int x = 2;
        System.out.println(Occur(arr,n,x));
        System.out.println(Occurfirst(arr,n,x));
    }
    public static int Occur(int[] arr,int n , int x){
        int highindex = -1;
        int low = 0 ;
        int high = n-1;


        while( low <= high){
            int mid = (low+high) / 2;


            if( x < arr[mid]){
                high = mid -1;
            }

            else if( x > arr[mid]){
                low = mid + 1;
            }

            else{
                highindex = mid;
                low = mid +1;
            }
        }
        return highindex;
    }

    public static int Occurfirst(int[] arr,int n , int x){
        int highindex = -1;
        int low = 0 ;
        int high = n-1;


        while( low <= high){
            int mid = (low+high) / 2;


            if( x < arr[mid]){
                high = mid -1;
            }

            else if( x > arr[mid]){
                low = mid + 1;
            }

            else{
                highindex = mid;
                high = mid - 1;
            }
        }
        return highindex;
    }
}
