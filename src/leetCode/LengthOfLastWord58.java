package leetCode;

public class LengthOfLastWord58 {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        String[] strArray = s.split(" ");
        return strArray[strArray.length-1].length();
    }
}
