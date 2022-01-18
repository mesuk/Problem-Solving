package leetCode;

public class FirstMissingPositive {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 0};
        int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int[] newArray = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                continue;
            }
            newArray[nums[i]] = newArray[nums[i]] + 1;
        }

        int missingValue = -1;

        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] <= 0) {
                missingValue = i;
                break;
            }
        }

        return missingValue < 0 ? newArray.length : missingValue;
    }


}
