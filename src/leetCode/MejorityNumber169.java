package leetCode;

import java.util.HashMap;

public class MejorityNumber169 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int maxCount = 0;
        int value = 0;
        for (Integer i : nums
        ) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Integer key : map.keySet()
        ) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                value = key;
            }

        }

        if (nums.length / 2 <= maxCount) {
            return value;
        }

        return 0;
    }
}
