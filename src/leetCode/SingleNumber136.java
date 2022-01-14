package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber136 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/single-number/

//        int[] nums = new int[]{2, 2, 1};
        int[] nums = new int[]{2, 2, 1, 1, 2, 4, 5, 4};

        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> dataFrequencyMap = new HashMap<>();

        int tempKey;
        for (int i = 0; i < nums.length; i++) {
            tempKey = nums[i];
            if (dataFrequencyMap.containsKey(tempKey)) {
                dataFrequencyMap.put(tempKey, dataFrequencyMap.get(tempKey) + 1);
            } else {
                dataFrequencyMap.put(tempKey, 1);
            }
        }

        for (Integer key : dataFrequencyMap.keySet()
        ) {
            if (dataFrequencyMap.get(key) == 1) {
                return key;
            }
        }

        return 0;
    }
}
