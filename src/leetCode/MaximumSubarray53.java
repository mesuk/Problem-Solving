package leetCode;

public class MaximumSubarray53 {
    public static void main(String[] args) {

        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int currentSum = nums[0], maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
