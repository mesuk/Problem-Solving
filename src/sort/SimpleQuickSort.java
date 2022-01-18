package sort;

import java.util.Arrays;

public class SimpleQuickSort {
    public static void main(String[] args) {
//        int[] nums = {9, 3, 4, 8, 5, 0, 6, 2, 1, 7};
        int[] nums = {3, 8, 5, 6, 2, 7, 4};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums, int l, int h) {

        if (l < h) {
            int pIndex = partition(nums, l, h);
            sort(nums, l, pIndex - 1);
            sort(nums, pIndex + 1, h);
        }

    }

    public static int partition(int[] nums, int l, int h) {
        // 3, 8, 5, 6, 2, 7, 4

        // this method will place pivot in right place in given array with certain position
        // all less elements will be left side and greater elements will be in right side of pivot
        // Finally returns pivot position
        int pIndex = l;
        int pivot = nums[h];

        int temp;
        for (int i = l; i <= h; i++) {
            if (nums[i] <= pivot) {
                temp = nums[pIndex];
                nums[pIndex] = nums[i];
                nums[i] = temp;
                pIndex++;
            }
        }
        return pIndex - 1;
    }
}
