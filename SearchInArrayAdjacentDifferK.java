//Searching in an array where adjacent differ by at most k

public class SearchInArrayAdjacentDifferK {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9};
        int k =2;                     // maximum differnce in adjacent
        int x = 9;                // to find
        System.out.println(OccurIndex(arr,k,x));
    }
    public static int OccurIndex(int[] arr, int k , int x){
        int i = 0;
        while(i < arr.length){

            if(x == arr[i]){
                return i;
            }

            i = i + Math.max(1, ((x - arr[i] )/ k));

        }
        return -1;
    }
}
