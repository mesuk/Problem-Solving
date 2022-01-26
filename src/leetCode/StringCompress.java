package leetCode;

public class StringCompress {

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }

        int index = 0;
        int backword = 0;
        int forword = 0;
        while (backword < chars.length) {
            forword = backword;
            while (forword < chars.length && chars[backword] == chars[forword]) {
                forword++;
            }
            chars[index++] = chars[backword];
            if (forword - backword > 1) {
                String count = String.valueOf(forword - backword);
                for (int i = 0; i < count.length(); i++) {
                    chars[index++] = count.charAt(i);
                }
            }
            backword = forword;
        }

        return index;

    }
}
