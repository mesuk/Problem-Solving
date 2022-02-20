package blind75;

public class MaximumSubArray53 {
    //https://leetcode.com/problems/maximum-subarray/
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i =1 ; i< nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static int maxSubArrayBruteForce(int[] nums) {

        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {

            int currentSum = Integer.MIN_VALUE;
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                currentSum = Math.max(sum, currentSum);
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
