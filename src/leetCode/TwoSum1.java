package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
//        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSumWorst(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visitedMap = new HashMap<>();

        int key;
        for (int i = 0; i < nums.length; i++) {
            key = target - nums[i];
            if (visitedMap.containsKey(key)) {
                return new int[]{visitedMap.get(key), i};
            } else {
                visitedMap.put(nums[i], i);
            }
        }

        return null;
    }

    public static int[] twoSumWorst(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
