package leetCode;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        // Longest common prefix string
        StringBuilder longestCommonPrefix = new StringBuilder();

        // Base condition
        if (strs == null || strs.length == 0) {
            return longestCommonPrefix.toString();
        }

        int minimumLength = strs[0].length();
        // Find the minimum length string from the array
        for (int i = 1; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength, strs[i].length());
        }

        char currentChar;
        // Loop for the minimum length
        for (int i = 0; i < minimumLength; i++) {
            // Get the current character from first string
            currentChar = strs[0].charAt(i);

            // Check if this character is found in all other strings or not
            for (String str : strs) {
                if (str.charAt(i) != currentChar) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(currentChar);
        }
        return longestCommonPrefix.toString();
    }
}