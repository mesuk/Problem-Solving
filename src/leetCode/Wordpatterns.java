package leetCode;

import java.util.HashMap;

public class Wordpatterns {
    public static void main(String[] args) {
        // https://leetcode.com/problems/word-pattern/
//        String pattern = "abba", s = "dog cat cat dog";
        String pattern = "abba", s = "dog cat cat fish";

        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(words.length != pattern.length()){
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        Character currentChar;
        for (int i = 0; i < words.length; i++) {
            currentChar = pattern.charAt(i);
            if (map.containsKey(currentChar)) {
                if (!words[i].equals(map.get(currentChar))) {
                    return false;
                }
            } else {
                if (map.containsValue(words[i])) {
                    return false;
                }
                map.put(currentChar, words[i]);
            }
        }
        return true;
    }
}
