package leetCode;

import java.util.HashMap;

public class ValidAnagram242 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/valid-anagram/

//        String s = "anagram", t = "nagaram"; -- true
        String s = "ab", t = "a"; // false
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> dataMap = new HashMap<>();

        for (Character c : s.toCharArray()
        ) {
            if (dataMap.containsKey(c)) {
                dataMap.put(c, dataMap.get(c) + 1);
            } else {
                dataMap.put(c, 1);
            }

        }

        for (Character c : t.toCharArray()
        ) {
            if (!dataMap.containsKey(c)) {
                return false;
            } else {
                int count = dataMap.get(c);
                if (count == 1) {
                    dataMap.remove(c);
                } else {
                    count--;
                    dataMap.put(c, count);
                }
            }
        }

        return dataMap.size()>0?false:true;
    }
}
