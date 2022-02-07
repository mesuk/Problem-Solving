package leetCode;

import java.util.HashMap;

public class FirstUniqueCharecter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if(map.get(chars[i]) == 1){
                return i;
            }
        }

        return -1;

    }
}
