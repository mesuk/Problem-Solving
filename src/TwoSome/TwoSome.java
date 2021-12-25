package TwoSome;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSome {
    public static void main(String[] args) {

        int [] nums  = new int[]{2,7,11,15};
        int target = 17;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visitedNumbers = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; ++i) {
            Integer newNumber = visitedNumbers.get(target - nums[i]);
            if (newNumber != null) {
                return new int[]{newNumber, i};
            }
            visitedNumbers.put(nums[i], i);
        }

        return null;
    }
}
