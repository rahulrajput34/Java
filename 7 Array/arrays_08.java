// To reverse an array
// Method 2: here time complexcity  n / 2

public class arrays_08 {
    public static void revArray(int numbers[]) {
        int len = numbers.length;
        int start = 0;
        int end = len - 1;
        while (start < end) {
            // swapping
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        revArray(numbers);
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");
        }
    }
}
