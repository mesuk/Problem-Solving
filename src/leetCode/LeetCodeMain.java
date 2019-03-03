package leetCode;

public class LeetCodeMain {

    public static void main(String[] args) {
        LeetCodeProblems leetCodeProblems =new LeetCodeProblems();

        int number=100;
        int newBase=7;

        String convertedNumber = leetCodeProblems.baseConversion(number);
        System.out.println("Old Number:"+number);
        System.out.println("New base :"+newBase);
        System.out.println("Converted number :"+convertedNumber);

        System.out.println();
        number=-7;
        newBase=7;

        convertedNumber = leetCodeProblems.baseConversion(number);
        System.out.println("Old Number:"+number);
        System.out.println("New base :"+newBase);
        System.out.println("Converted number :"+convertedNumber);

    }
}
