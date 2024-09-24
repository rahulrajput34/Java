// time complexity = O(n3)
// Max and Min subarray Sum: Method 1 -- bad time complexity
public class arrays_01 {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        // for finding subarrays
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0; // for reset the value of currsum
                for (int k = start; k <= end; k++) {
                    // Subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                // comparison for largest
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                if (minsum > currSum) {
                    minsum = currSum;
                }
            }
        }
        System.out.println("The max sum is: " + maxSum);
        System.out.println("The min sum is: " + minsum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSubarraySum(numbers);

    }
}