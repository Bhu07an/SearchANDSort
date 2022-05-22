public class CountTripletSumLessThanValue {
    public static void main(String[] args){

    }
}









/*
Given an array arr[] of distinct integers of size N and a value sum, the task is to find the count of triplets (i, j, k),
having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.

 long countTriplets(long arr[], int n,int sum)               // brute force
    {
        Arrays.sort(arr);
        long count = 0;
        for(int i = 0 ; i <= n -3 ; i++){
            for(int j = i+1 ; j <= n -2 ; j++){
                for(int k =j+1; k <= n-1 ; k++){
                    long value = arr[i] + arr[j] + arr[k];
                    if( value < sum){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

 */