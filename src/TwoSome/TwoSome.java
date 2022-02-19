package TwoSome;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSome {
    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 17;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visitedNumMap = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; ++i) {
            Integer subtractNumber = visitedNumMap.get(target - nums[i]);
            if (subtractNumber != null) {
                return new int[]{subtractNumber, i};
            }
            visitedNumMap.put(nums[i], i);
        }

        return null;
    }
}
