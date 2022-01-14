package leetCode;

public class FibonakkiNumber509 {

    public static void main(String[] args) {
        // https://leetcode.com/problems/fibonacci-number/

        /*The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

        F(0) = 0, F(1) = 1
        F(n) = F(n - 1) + F(n - 2), for n > 1.
        Given n, calculate F(n).*/

        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

        int n = 3;
        System.out.println(fib(n));

    }

    public static int fib(int n) {

        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = 0;

        while (n-- > 1) {
            sum = a + b;
            a = b;
            b = sum;

        }
        return sum;
    }

}
