package leetCode;

import java.util.Arrays;

public class MoveZeros283 {
    public static void main(String[] args) {
//        https://leetcode.com/problems/move-zeroes/submissions/

//        Input
//                [73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0]
//        Output
//                [73348,66106,53996,18849,83457,0,0,0,0,0,0]
//        Expected
//                [73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0]

//        int[] nums = new int[]{0, 1, 0, 3, 12};
        int[] nums = new int[]{73348, 66106, -85359, 53996, 18849, -6590, -53381, -86613, -41065, 83457, 0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int nonZeroPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroPosition] = nums[i];
                nonZeroPosition++;
            }
        }

        for (int i = nonZeroPosition; i < nums.length; i++) {
            nums[nonZeroPosition] = 0;
            nonZeroPosition++;
        }
    }
}
