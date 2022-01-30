package leetCode;

public class RemoveDuplicatesFromSortedArray1 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int i = 1;
        int j = 1;

        while (i < nums.length) {
            if (nums[j - 1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;

    }
}
