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

        System.out.println();
        number=25;
        boolean isPerfectNumber=leetCodeProblems.checkPerfectNumber(number);
        System.out.println("Number :"+number +" isPerfect : "+isPerfectNumber);


        System.out.println();
        number=28;
        isPerfectNumber=leetCodeProblems.checkPerfectNumber(number);
        System.out.println("Number :"+number +" isPerfect : "+isPerfectNumber);

        System.out.println();
//        int[] nums={3,9,5,1,2};
//        int[] nums={2, 2, 3, 1};
//        int[] nums={1,2,2};
//        int[] nums={5,2,2};
//        int[] nums={1,2,-2147483648};
        int[] nums={1,-2147483648,2};
        int result=leetCodeProblems.thirdMax(nums);
        System.out.println("Number :"+result);

        System.out.println();
        int thNumber=3;
        int fibNumber=leetCodeProblems.fib(thNumber);
        System.out.println(thNumber+" Fibonacci Number  :"+fibNumber);

        System.out.println();
        thNumber=6;
        fibNumber=leetCodeProblems.fib(thNumber);
        System.out.println(thNumber+" Fibonacci Number  :"+fibNumber);


        System.out.println();
        thNumber=10;
        fibNumber=leetCodeProblems.fib(thNumber);
        System.out.println(thNumber+" Fibonacci Number  :"+fibNumber);

        System.out.println();
        thNumber=12;
        fibNumber=leetCodeProblems.fib(thNumber);
        System.out.println(thNumber+" Fibonacci Number  :"+fibNumber);
    }
}
