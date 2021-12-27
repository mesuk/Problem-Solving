package leetCode;

import java.util.Arrays;

public class OnePlus66 {
    public static void main(String[] args) {
//        int[] arr = {4, 3, 2, 1};
//        int[] inputArray = {4, 3, 9, 9};
        int[] inputArray = {9, 9, 9, 9};
        System.out.println("Input : " + Arrays.toString(inputArray));
        int[] outputArray = plusOne(inputArray);
        System.out.println("Output : " + Arrays.toString(outputArray));
    }

    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
