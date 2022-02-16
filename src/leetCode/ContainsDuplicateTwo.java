package leetCode;

import java.util.HashMap;

// https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicateTwo {
    public static void main(String[] args) {

//        [1,2,3,1,2,3]
//        2
        int[] nums = {1, 2, 3, 1, 2, 3};
//        int[] nums = {99, 99};

        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (map.containsKey(currentNum) && (i - map.get(currentNum)) <= k) {
                return true;
            } else {
                map.put(currentNum, i);
            }
        }
        return false;
    }
}
