package leetCode;

public class ReverseWordInString {
    //https://leetcode.com/problems/reverse-words-in-a-string/

    public static void main(String[] args) {
//        String s = "the sky is blue";
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] sArray = s.trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = sArray.length - 1; i >= 0; i--) {
            if(sArray[i].trim().length()==0){
                continue;
            }
            stringBuilder.append(sArray[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
