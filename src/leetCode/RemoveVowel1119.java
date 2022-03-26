package leetCode;

import java.util.HashMap;

public class RemoveVowel1119 {
    public static void main(String[] args) {
        String s = "leetcodeisacommunityforcoders";
        System.out.println(removeVowels(s));

    }

    public static String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();

        HashMap<Character, Boolean> map = new HashMap<>();
        map.put('a', true);
        map.put('A', true);
        map.put('e', true);
        map.put('E', true);
        map.put('i', true);
        map.put('I', true);
        map.put('o', true);
        map.put('O', true);
        map.put('u', true);
        map.put('U', true);

        for (char c : s.toCharArray()
        ) {
            if (!map.containsKey(c)) {
                sb.append(c);
            }

        }
        return sb.toString();
    }
}
