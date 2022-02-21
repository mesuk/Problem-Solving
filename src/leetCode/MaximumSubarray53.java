package leetCode;

public class MaximumSubarray53 {
    public static void main(String[] args) {

        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        // 1. current & maxSum assign to first element
        // 2. currentSum take all value, maxSum always take max value
        int currentSum = nums[0], maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // 3. calculate current sum, take max after calculation
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // 4. Assign max to max sum
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
