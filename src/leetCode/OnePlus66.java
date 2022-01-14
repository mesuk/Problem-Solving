package leetCode;

import java.util.Arrays;

public class OnePlus66 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/plus-one/
//        int[] arr = {4, 3, 2, 1};
//        int[] inputArray = {4, 3, 9, 9};
        int[] inputArray = {9, 9, 9, 9};
        System.out.println("Input : " + Arrays.toString(inputArray));
        int[] outputArray = plusOne(inputArray);
        System.out.println("Output : " + Arrays.toString(outputArray));
    }

    public static int[] plusOne(int[] digits) {
        // Add start from MSB, so start from last
        // If any number is <9 then just add 1 and return
        // otherwise add 0 on that position
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // 9999+1 [4 digits] = 10,000 [5 digits]
        // In this step, all value set as 0
        // So we has one carry and value is 1
        // Add extra space and set value 0
        int[] newNumber = new int[length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
