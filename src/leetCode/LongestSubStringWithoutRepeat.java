package leetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeat {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int i = 0;
        int j = 0;

        while (i < s.length()) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                i++;
                maxLength = Math.max(set.size(), maxLength);
            } else {
                set.remove(s.charAt(j));
                j++;
            }
        }
        return maxLength;
    }
}
