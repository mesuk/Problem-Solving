package leetCode;

public class PalindromeNumber9 {
    public static void main(String[] args) {
//        Given an integer x, return true if x is palindrome integer.
//
//        An integer is a palindrome when it reads the same backward as forward.
//
//                For example, 121 is a palindrome while 123 is not.

        int x = 121;
        System.out.println(isPalindrome(x));

    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long result = 0;
        int mod = 0;

        int number = x;


        while (number > 0) {
            mod = number % 10;
            result = result * 10 + mod;
            number = number / 10;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0;
        }

        return result == x;

    }
}
