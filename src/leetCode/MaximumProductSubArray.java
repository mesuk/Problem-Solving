package leetCode;

public class MaximumProductSubArray {
    // https://leetcode.com/problems/maximum-product-subarray/
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxProduct = 1;
        int result = Integer.MIN_VALUE;
        int acc = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = j; k <= i; k++) {
                    maxProduct = maxProduct * acc * nums[k];
                    result = Math.max(maxProduct, result);
                }
            }
        }
        return result;
    }
}
