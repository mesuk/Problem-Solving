package leetCode;

public class NumberOfSegmentInString434 {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));

    }

    public static int countSegments(String s) {
        if (s.trim().length() == 0) {
            return 0;
        }

        StringBuilder sb = new StringBuilder();
        int spaceCount = 0;
        for (char c : s.trim().toCharArray()
        ) {
            if (c == ' ') {
                spaceCount++;
                continue;
            }
            if (spaceCount > 0) {
                sb.append(" ");
                spaceCount = 0;
            }
            sb.append(c);
        }

        String[] arr = sb.toString().split(" ");
        return arr.length;
    }
}
