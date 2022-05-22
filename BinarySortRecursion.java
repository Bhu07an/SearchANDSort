public class BinarySortRecursion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int l = 0;
        int r = arr.length;
        int x = 9;
        System.out.println(Sort(arr, l, r, x));
    }

    public static int Sort(int[] arr, int l, int r, int x) {

        if (l > r) return -1;

        int mid = (l + r) / 2;
        if (arr[mid] == x) {
            return mid;
        }

        if (x > arr[mid]) {
            return Sort(arr, mid + 1, r, x);
        } else {
            return Sort(arr, l, mid - 1, x);
        }
    }

}
