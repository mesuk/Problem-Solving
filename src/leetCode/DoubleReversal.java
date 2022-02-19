package leetCode;

public class DoubleReversal {
    public static void main(String[] args) {
        //https://leetcode.com/problems/a-number-after-a-double-reversal/

        int num = 526;
        System.out.println(isSameAfterReversals(num));
    }

    public static boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        } else if (num % 10 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
