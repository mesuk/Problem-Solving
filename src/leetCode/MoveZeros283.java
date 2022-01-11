package leetCode;

import java.util.Arrays;

public class MoveZeros283 {
    public static void main(String[] args) {

        int [] nums = new int []{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void moveZeroes(int[] nums) {
        int [] tempNums = new int[nums.length];

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                tempNums[counter] = nums[i];
                counter++;
            }
        }
        nums = tempNums;
    }
}
