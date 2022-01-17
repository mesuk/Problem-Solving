package leetCode;

import java.util.Stack;

public class LongestValidParentheses32 {

    public static void main(String[] args) {
        //https://leetcode.com/problems/longest-valid-parentheses/
//        Input: s = ")()())"
//        Output: 4
//        Explanation: The longest valid parentheses substring is "()()".

        String s = ")()())";
        System.out.println(longestValidParentheses(s));

    }

    public static int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        int left = -1;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '(') {
                stack.push(j);
            } else {
                if (stack.isEmpty()) {
                    left = j;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        max = Math.max(max, j - left);
                    } else {
                        max = Math.max(max, j - stack.peek());
                    }
                }
            }
        }
        return max;

    }
}
