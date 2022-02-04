package leetCode;

public class StringCompress {

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'a', 'b', 'b', 'c', 'd', 'd'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }

        int index = 0;
        int backword = 0;
        int forword = 0;

        int count = 0;
        while (backword < chars.length) {
            while (forword < chars.length && chars[backword] == chars[forword]) {
                forword++;
            }
            chars[index++] = chars[backword];
            count = forword - backword;
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (int i = 0; i < countStr.length(); i++) {
                    chars[index++] = countStr.charAt(i);
                }
            }
            backword = forword;
        }

        return index;

    }
}
