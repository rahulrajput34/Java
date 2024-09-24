// time complexity = O(n2)
// Max and Minimum subarray Sum: Method 3 prefix Sum method - less time complexity than the first method
public class arrays_03 {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int preFix[] = new int[numbers.length];

        // To calculate prefix array:
        preFix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            preFix[i] = preFix[i - 1] + numbers[i];
        }

        // for finding subarrays
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                // for reset the value of currsum
                currSum = start == 0 ? preFix[end] : preFix[end] - preFix[start - 1];
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