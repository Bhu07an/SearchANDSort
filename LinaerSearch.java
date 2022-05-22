public class LinaerSearch {
    public static void main(String[] args){
        int[] arr = {1,3,5,2,5,7};
        int x = 5;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                System.out.println(x+ " found at index "+ i);

            }
        }
    }
}
