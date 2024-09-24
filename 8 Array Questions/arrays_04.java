// time complexity = O(n)
// Kadan's algorithums :Max and Minimum subarray Sum -- bahot minimum time complexity
// it simpliy say that omit negative numbers
public class arrays_04 {
    public static void minAndmaxSubArrays(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];

            if (numbers[i] < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);

        }
        System.out.println("The min sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        minAndmaxSubArrays(numbers);
    }
}
