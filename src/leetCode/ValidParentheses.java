package leetCode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        //https://leetcode.com/problems/valid-parentheses/
        //        Input: s = "()[]{}"
        //        Output: true

        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        // Learning the data
        // We will find opening braces by closing braces.
        HashMap<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

        Stack<Character> stack = new Stack<>();

        // For any item, check it in stack
        // If character found in stack, that means this is closing character. We will check it's pair
        // from map and stacks top element. If not match then error.
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (mappings.containsKey(c)) {
                // closing tag found, it must be equals stack top elements
                Character topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                // opening tag -> adding into stack
                stack.push(c);
            }
        }
        // if stack not empty -> then error
        return stack.isEmpty();
    }
}
