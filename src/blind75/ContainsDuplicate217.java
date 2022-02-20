package blind75;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/contains-duplicate/
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> values = new HashMap<>();
        for (Integer item : nums
        ) {
            if (values.containsKey(item)) {
                return true;
            } else {
                values.put(item, 1);
            }
        }
        return false;

    }

    public static boolean containsDuplicateBySorting(int[] nums) {

        Integer[] numActual = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numActual[i] = nums[i];
        }

        Arrays.sort(numActual);

        for (int i = 0; i < numActual.length - 1; i++) {
            if (numActual[i].equals(numActual[i + 1])) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
