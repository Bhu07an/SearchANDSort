public class BinarySearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {110, 120, 60, 70, 80, 90};
        int n = arr.length;
        int x = 120;
        System.out.println(Index(arr, x));
    }

    public static int Index(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                return mid;
            }
            if (arr[low] < arr[mid]) {
                if (x >= arr[low] && x < arr[mid]) {
                    high = mid - 1;
                }
                else{
                    low =  mid +1;
                }
            }


            else {
                 if(x > arr[mid] &&  x <= arr[high]){
                     low = mid+1;
                 }
                 else{
                     high = mid -1;
                 }

            }
        }
        return -1;
    }
}