package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindCommonChar1002 {
    //https://leetcode.com/problems/find-common-characters/
    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        System.out.println(commonChars(words).toString());
    }

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        String w1 = words[0];
        for (int i = 0; i < w1.length(); i++) {
            if (map.containsKey(w1.charAt(i))) {
                map.put(w1.charAt(i), map.get(w1.charAt(i)) + 1);
            } else {
                map.put(w1.charAt(i), 1);
            }
        }

        for (int i = 1; i < words.length - 1; i++) {
            w1 = words[i];
            for (int j = 0; j < w1.length(); j++) {
                if(!map.containsKey(w1.charAt(i))){
                    break;
                }
            }
        }

        return result;
    }
}
