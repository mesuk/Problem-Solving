package leetCode;

import java.util.Arrays;

public class MedianTwoSortedArray4 {

    public static void main(String[] args) {
//        Input: nums1 = [1,2], nums2 = [3,4]
//        Output: 2.50000
//        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

//        int[] nums1 = {1, 2};
//        int[] nums2 = {3, 4};
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergeArray = new int[nums1.length + nums2.length];

        int currentIndex = 0;

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mergeArray[currentIndex] = nums1[i];
                i++;
            } else {
                mergeArray[currentIndex] = nums2[j];
                j++;
            }
            currentIndex++;
        }

        if (i < nums1.length) {
            for (int k = i; k < nums1.length; k++) {
                mergeArray[currentIndex] = nums1[k];
                currentIndex++;
            }
        }

        if (j < nums2.length) {
            for (int k = j; k < nums2.length; k++) {
                mergeArray[currentIndex] = nums2[k];
                currentIndex++;
            }
        }

        // 1,2,3,4,5,6

        double median = 0;
        int midPoint = (mergeArray.length-1) / 2;
        if (mergeArray.length % 2 == 1) {
            median = mergeArray[midPoint];
        } else {
            double x = mergeArray[midPoint];
            double y = mergeArray[midPoint+1];
            median = (x + y) / 2;
        }

        System.out.println(Arrays.toString(mergeArray));
        return median;
    }
}
