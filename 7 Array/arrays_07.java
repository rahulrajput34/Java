// To reverse an array
// Method 1:time complexcity -- O(n)
import java.util.Arrays;

public class arrays_07 {
    public static void reverseArray(int numbers[]) {
        int length = numbers.length;
        int reversedArray[] = new int[length];
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        reverseArray(numbers);
    }
}


