package leetCode;

public class ReverseInteger7 {

    public static void main(String[] args) {
        // https://leetcode.com/problems/reverse-integer/

        int x = 123456;
        System.out.println(reverse(x));

    }

    public static int reverse(int x) {
        long result = 0;
        int mod;
        while (x != 0) {
            mod = x % 10;
            result = result * 10 + mod;
            x = x / 10;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0;
        }
        return (int) result;
    }
}
