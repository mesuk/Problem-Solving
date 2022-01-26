package leetCode;

public class RemoveDuplicatesFromSortedArray80 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length < 3) {
            return nums.length;
        }

        int insertPosition = 2;
        for (int i = 2; i < nums.length; i++) {

            if (nums[i] != nums[insertPosition - 2]) {
                nums[insertPosition] = nums[i];
                insertPosition++;
            }

        }

        return insertPosition;

    }
}
