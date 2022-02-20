package leetCode;

public class FindMinimumInROatedArray {
    //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        //1. single number
        if (nums.length == 1) {
            return nums[0];
        }

        //2. Array is already sorted
        if (nums[nums.length - 1] > nums[0]) {
            return nums[0];
        }

        int l = 0, r = nums.length - 1;
        int m;
        while (r >= l) {
            m = l + (r - l) / 2;
            //3. mid > mid+1 value, then mid+1 value is min
            if (nums[m] > nums[m + 1]) {
                return nums[m + 1];
            }
            //4. mid < mid+1 value, then mid value is min
            if (nums[m] < nums[m - 1]) {
                return nums[m];
            }
            //5. mid > 0 position, then min is right side of mid. Update low to  mid+1
            if (nums[m] > nums[0]) {
                l = m + 1;
            } else {
                //6. mid < 0 position, then min is left side of mid. Update h to  mid-1
                r = m - 1;
            }
        }
        return -1;
    }
}
