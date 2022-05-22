import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DecendingSortMethod {
    public static void main(String[] args){
        Integer[] arr = {210,5,1,6,3,54,2,4};

        Arrays.sort(arr , Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}
