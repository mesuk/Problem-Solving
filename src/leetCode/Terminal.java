package leetCode;

import java.util.HashMap;
import java.util.Stack;

public class Terminal {
    public static void main(String[] args) {

        int[] nums1 = {1, 2}, nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];

        int i = 0, j = 0;
        int mergePosition = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[mergePosition++] = nums1[i++];
            } else {
                mergedArray[mergePosition++] = nums2[j++];
            }
        }

        if (i < nums1.length) {
            for (int k = i; k < nums1.length; k++) {
                mergedArray[mergePosition++] = nums1[k];
            }
        }
        if (j < nums2.length) {
            for (int k = j; k < nums2.length; k++) {
                mergedArray[mergePosition++] = nums2[k];
            }
        }

        int length = mergedArray.length;
        if (length % 2 != 0) {
            return mergedArray[length / 2];
        } else {
            return (double) (mergedArray[length / 2 - 1] + mergedArray[length / 2]) / 2;
        }
    }
}
