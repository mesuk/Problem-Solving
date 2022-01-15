package sort;

import java.util.Arrays;

public class SimpleBubbleSort {
    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {

        int temp;
        int jLength;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums));
            System.out.println("\nI :" + i);
            jLength = (nums.length - i - 1);
            for (int j = 0; j < jLength; j++) {
                System.out.println(Arrays.toString(nums));
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

    }
}
