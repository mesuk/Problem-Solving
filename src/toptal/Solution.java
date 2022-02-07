package toptal;

public class Solution {
    public static void main(String[] args) {
//        String message = "Codility We test coders";
        String message = "Why not";
//        int k = 14;
        int k = 100;
        System.out.println(solution(message, k));

    }

    public static String solution(String message, int K) {
        if (message == null || message.trim().length() == 0) {
            return null;
        }
//        if (message.length() < K) {
//            return null;
//        }

        StringBuilder result = new StringBuilder();
        String[] words = message.trim().split(" ");
        for (String s: words
             ) {
            if(result.length() + s.length() > K){
                break;
            }
            result.append(s).append(" ");
        }

        return result.toString().trim();
    }
}
