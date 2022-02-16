package leetCode;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicString {
    public static void main(String[] args) {
        //https://leetcode.com/problems/isomorphic-strings/
//        String s = "egg", t = "add";
        String s = "badc", t = "baba";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) != t.charAt(i)) {
                return false;
            } else if (map.containsValue(t.charAt(i))) {
                for (Map.Entry<Character,Character> entry:map.entrySet()
                     ) {
                    if(entry.getValue() == t.charAt(i) && entry.getKey() != c){
                        return false;
                    }
                }
            }
            map.put(c, t.charAt(i));
        }
        return true;
    }
}
