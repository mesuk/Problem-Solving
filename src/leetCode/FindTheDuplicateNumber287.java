package leetCode;

import java.util.HashMap;

public class FindTheDuplicateNumber287 {
    public static void main(String[] args) {
//https://leetcode.com/problems/find-the-duplicate-number/
//        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//                There is only one repeated number in nums, return this repeated number.
//        You must solve the problem without modifying the array nums and uses only constant extra space.

//        int[] nums = {1, 3, 4, 2, 2};
        int[] nums = {3, 1, 3, 4, 2};
//        System.out.println(findDuplicate(nums));
        System.out.println(findDuplicateFloyed(nums));
    }

    public static int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            }
            map.put(nums[i], 1);
        }
        return 0;

    }

    public static int findDuplicateFloyed(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

    }
}
