package blind75;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3, t = 0;
        System.out.println(containsNearbyAlmostDuplicate(nums, k, t));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Set<Integer> uniqueVal = new HashSet<>();
        for (Integer i : nums
        ) {
            uniqueVal.add(i);
        }

        if (t == 0 && uniqueVal.size() == nums.length) {
            return false;
        }
        Long iVal, jVal;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (j >= nums.length) {
                    break;
                }
                iVal = (long) nums[i];
                jVal = (long) nums[j];

                if (Math.abs(iVal - jVal) <= t && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}
