package leetCode;

import java.util.HashMap;

public class FirstMissingPositive {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 0};
        int[] nums = {7, 8, 9, 11, 12};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {

        if (nums.length == 0) {
            return 1;
        }

        int n = nums.length;

        int oneCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                oneCount++;
            }
        }
        if (oneCount == 0) {
            return 1;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i],i);
        }


        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int[] newArray = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                continue;
            }
            newArray[nums[i]] = newArray[nums[i]] + 1;
        }

        int missingValue = -1;

        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] <= 0) {
                missingValue = i;
                break;
            }
        }

        return missingValue < 0 ? newArray.length : missingValue;
    }


}
