package leetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }


    public static void rotate(int[] nums, int k) {

//        let a= [1,2,3,4,5,6,7]
//        k = 3.

        k %= nums.length;
        // reverse whole array, you will get[7,6,5,4,3,2,1]
        reverse(nums, 0, nums.length - 1);
        // reverse the elements from 0 to k-1, reverse the elements 7,6,5, [5,6,7,4,3,2,1]
        reverse(nums, 0, k - 1);
        // reverse the elements from k to n-1, reverse the elements 4,3,2,1, you will get[5,6,7,1,2,3,4]
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
