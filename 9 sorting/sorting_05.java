// Inbuild sort
// time cpmplexity = 0(nlogn)
//.coolection is a java framework
import java.util.Arrays;
import java.util.Collections;
public class sorting_05 {
    public static void main(String[] args) {
        //small int means primitive datatype
        // big integer meaans object type
        Integer arr[] = { 5, 1, 3, 4, 5, 6, 1, 4, 5 }; // we have to give big Integer over here
        Arrays.sort(arr, 0, 8, Collections.reverseOrder());
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }
}
