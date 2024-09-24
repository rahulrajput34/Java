// Print the subarrays
public class arrays_10 {

    public static void subArray(int numbers[]) {
        int totalsubarray = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) { // print subarray
                    System.out.print(numbers[k] + " ");
                }
                totalsubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + totalsubarray);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        subArray(numbers);
    }
}
