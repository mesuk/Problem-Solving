package leetCode;

import java.util.HashMap;

public class FindTheDuplicateNumber287 {
    public static void main(String[] args) {
//https://leetcode.com/problems/find-the-duplicate-number/
//        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//                There is only one repeated number in nums, return this repeated number.
//        You must solve the problem without modifying the array nums and uses only constant extra space.

//        int[] nums = {1, 3, 4, 2, 2};
        int[] nums = {1, 3, 4, 2, 2};
//        System.out.println(findDuplicate(nums));
//        System.out.println(findDuplicateFloyed(nums));
        System.out.println(findDuplicateModify(nums));
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

    public static int findDuplicateModify(int[] nums) {

        int cursor = 0;
        int duplicate = -1;
        for (int i = 0; i < nums.length; i++) {
            cursor = Math.abs(nums[i]);
            if (nums[cursor] < 0) {
                duplicate = cursor;
                break;
            } else {
                nums[cursor] *= -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return duplicate;

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

    public static int findDuplicateN2TimeLimit(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
