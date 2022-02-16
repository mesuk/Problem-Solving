package leetCode;

import java.util.HashMap;
import java.util.Stack;

public class xx {
    public static void main(String[] args) {
        String arr = "()[]{}";
        System.out.println(isValid(arr));
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> data = new HashMap<>();
        data.put(')', '(');
        data.put('}', '{');
        data.put(']', '[');

        Stack<Character> stack = new Stack<>();

        Character topChar;
        for (Character c : s.toCharArray()
        ) {
            if (data.containsKey(c)) {
                topChar = stack.isEmpty() ? '#' : stack.pop();
                if (!data.get(c).equals(topChar)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();

    }
}
