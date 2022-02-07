package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelOfString345 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        Set<Character> vowel = new HashSet<>();
        vowel.add('A');
        vowel.add('a');
        vowel.add('E');
        vowel.add('e');
        vowel.add('I');
        vowel.add('i');
        vowel.add('O');
        vowel.add('o');
        vowel.add('U');
        vowel.add('u');
        int f = 0;
        int l = s.length() - 1;

        char[] nums = s.toCharArray();
        char temp;

        while (f < l) {
            while (f < l && !vowel.contains(nums[f])) {
                f++;
            }
            while (f < l && !vowel.contains(nums[l])) {
                l--;
            }

            temp = nums[f];
            nums[f++] = nums[l];
            nums[l--] = temp;
        }
        return String. valueOf(nums);
    }
}
