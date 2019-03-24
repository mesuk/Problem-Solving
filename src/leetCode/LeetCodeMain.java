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


        System.out.println();
        int mainNumber=1534236469;
        int revNumber=leetCodeProblems.reverse(mainNumber);
        System.out.println(" Reverse Number  :"+revNumber);

        System.out.println();
        System.out.println();
        int Number=-121;
        boolean isPalindrome=leetCodeProblems.isPalindrome(Number);
        System.out.println(+Number+" is palindrome Number  :"+isPalindrome);


        System.out.println();
        System.out.println();
        String sentence="a  ";
        int wordLength=leetCodeProblems.lengthOfLastWord(sentence);
        System.out.println(" Word length  :"+wordLength);


        System.out.println();
        System.out.println();
        ListNode root=leetCodeProblems.prepareLinkedList();
        ListNode newRoot=leetCodeProblems.deleteDuplicates(root);
        System.out.println();

        System.out.println();
        System.out.println();
//        int[] nums1={1,1,2,3,3,4};
        int[] nums1={1,1,2,3,3,4,4};
//        int[] nums1={0,0,1,1,1,2,2,3,3,4};
//        int[] nums1={1,1,2};
        int uniqueNumberCount=leetCodeProblems.removeDuplicates(nums1);
        System.out.println(uniqueNumberCount);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(""+nums1[i]+" ");
        }

        int[] mNums1={4,5,6,0,0,0};
        int[] mNums2={1,2,3};

        leetCodeProblems.merge(mNums1,3,mNums2,3);

        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);

        ListNode l2=new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);

        ListNode newNode=leetCodeProblems.mergeTwoLists(l1,l2);


    }
}
