package leetCode;

public class IsSubSequences {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {

        int tPosition = 0;

        char c;
        boolean isFound;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            isFound = false;

            while (tPosition < t.length()) {
                if (c == t.charAt(tPosition)) {
                    isFound = true;
                    tPosition++;
                    break;
                }
                tPosition++;
            }
            if (!isFound) {
                return false;
            }
        }
        return true;
    }
}
