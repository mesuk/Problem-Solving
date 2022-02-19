package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DisapearedNumber448 {
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public static void main(String[] args) {
//        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
//        System.out.println(findDisappearedNumbers(nums).toString());
        System.out.println(findDisappearedNumbersNew(nums).toString());
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] actualNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            actualNums[nums[i] - 1] = actualNums[nums[i] - 1] + 1;
        }
        System.out.println(Arrays.toString(actualNums));

        List<Integer> missingNumsList = new ArrayList<>();
        for (int i = 0; i < actualNums.length; i++) {
            if (actualNums[i] == 0) {
                missingNumsList.add(i + 1);
            }
        }
        return missingNumsList;
    }
    public static List<Integer> findDisappearedNumbersNew(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num: nums
             ) {
            map.put(num, 1);
        }
        List<Integer> missingNumsList = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            if(!map.containsKey(i)){
                missingNumsList.add(i);
            }
        }
        return missingNumsList;
    }
}
