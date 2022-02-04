package leetCode;

import java.util.Stack;

public class LongestValidParenthesis {
    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longestValidParentheses(s));

    }

    public static int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] c = s.toCharArray();
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                stack.push(c[i]);
            } else if (c[i] == ')' && !stack.empty()) {
                count += 2;
                stack.pop();
            }
        }
        return count;
    }
}
