package leetCode;

import java.util.Arrays;

public class MergeTwoSortedArray88 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/merge-sorted-array/=
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergeArray = new int[nums1.length];

        int mergeArrayIndex = 0;
        int num1Index = 0;
        int num2Index = 0;

        while (num1Index < m && num2Index < n) {
            if (nums1[num1Index] < nums2[num2Index]) {
                mergeArray[mergeArrayIndex++] = nums1[num1Index];
                num1Index++;
            } else {
                mergeArray[mergeArrayIndex++] = nums2[num2Index];
                num2Index++;
            }
        }

        if (num1Index < m) {
            for (int i = num1Index; i < m; i++) {
                mergeArray[mergeArrayIndex++] = nums1[num1Index];
                num1Index++;
            }
        }
        if (num2Index < n) {
            for (int i = num2Index; i < n; i++) {
                mergeArray[mergeArrayIndex++] = nums2[num2Index];
                num2Index++;
            }
        }
        for (int i = 0; i < mergeArray.length; i++) {
            nums1[i] = mergeArray[i];
        }

        System.out.println(Arrays.toString(nums1));
    }
}
