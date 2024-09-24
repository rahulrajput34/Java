// time complexity = O(n2)
// Max and Minimum subarray Sum: Method 2  -- less time complexicity than the above one method(chat gpt)
public class arrays_02 {
    public static void maxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int currSum = 0; // Reset the current sum for each new starting point
            for (int j = i; j < numbers.length; j++) {
                currSum += numbers[j]; // Add current element to the sum
                if (maxSum < currSum) {
                    maxSum = currSum; // Update maxSum if a new maximum is found
                }
                if(minsum > currSum){
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
