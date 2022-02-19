package leetCode;

import java.util.Arrays;

public class FirstLastPositionSortedArray34 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

        /*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

        If target is not found in the array, return [-1, -1].

        You must write an algorithm with O(log n) runtime complexity.

        Example 1:

        Input: nums = [5,7,7,8,8,10], target = 8
        Output: [3,4]
        Example 2:

        Input: nums = [5,7,7,8,8,10], target = 6
        Output: [-1,-1]*/

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

//        int[] nums = {5, 7, 7, 8, 8, 10};
//        int target = 6;
//        int[] nums = {1, 4};
//        int[] nums = {1, 1, 2};
//        int target = 1;

        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }

        int lowerBound = findBound(nums, target, true);
        if (lowerBound == -1) {
            return new int[]{-1, -1};
        }
        int upperBound = findBound(nums, target, false);

        return new int[]{lowerBound, upperBound};

    }

    public static int findBound(int[] nums, int target, boolean isFirst) {
//        int[] nums = {5, 7, 7, 8, 8, 10};
//        int target = 8;
        int l = 0;
        int mid;
        int h = nums.length - 1;

        while (l <= h) {
            mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                if (isFirst) {
                    if (l == mid || nums[mid - 1] != target) {
                        return mid;
                    } else {
                        h = mid - 1;
                    }
                } else {
                    if (mid == h || nums[mid + 1] != target) {
                        return mid;
                    } else {
                        l = mid + 1;
                    }
                }
            } else if (target < nums[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;

    }

    /*public static int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }


        int l = 0;
        int h = nums.length - 1;
        int mid = 0;

        while (l <= h) {
            mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                int s = mid - 1;
                int e = mid + 1;

                while (s >= 0) {
                    if (nums[s] != target) {
                        break;
                    }
                    s--;
                }

                if (s != mid) {
                    s++;
                }

                while (e < nums.length) {
                    if (nums[e] != target) {
                        break;
                    }
                    e++;
                }

                if (e != mid) {
                    e--;
                }

                return new int[]{s, e};

            } else if (target < nums[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return new int[]{-1, -1};

    }*/
}
