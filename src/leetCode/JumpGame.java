package leetCode;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int stepAt = 0;
        int arrayLength = nums.length-1;
        for (int i = 0; i < nums.length; i++) {

            if ((stepAt + nums[stepAt]) >= arrayLength) {
                return true;
            }
            stepAt += nums[i] - 1;
        }
        return false;
    }
}
