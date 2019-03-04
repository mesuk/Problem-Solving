package leetCode;

import java.lang.reflect.Array;

public class LeetCodeProblems {

    //504. Base 7
    public String baseConversion(int num) {

        int base = 7;
        if (num == 0) {
            return "" + 0;
        }

        boolean isNegativeNumber = (num < 0);

        if (isNegativeNumber) {
            num = num * (-1);
        }

        StringBuilder stringBuilder = new StringBuilder("");

        while (num >= base) {
            int reminder = num % base;
            stringBuilder.append(reminder);
            num = num / base;
        }
        stringBuilder.append(num);

        if (isNegativeNumber) {
            stringBuilder.append("-");
        }

        String convertedNumber = stringBuilder.reverse().toString();

        return convertedNumber;
    }

    //507. Perfect Number

    public boolean checkPerfectNumber(int num) {

        if (num <= 2) {
            return false;
        }

        int sumNumber = 0;
        for (int index = 1; index <= (num / 2); index++) {
            if (num % index == 0) {
                sumNumber += index;
            }
        }

        return num == sumNumber;
    }

    //414. Third Maximum Number
    public int thirdMax(int[] nums) {

        Integer firstMax = null, secondMax = null, thirdMax = null;

        for (int index = 0; index < nums.length; index++) {
            if (firstMax == null || nums[index] >= firstMax) {

                if (firstMax != null && nums[index] == firstMax) {
                    continue;
                }
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[index];


            } else if (secondMax == null || nums[index] >= secondMax) {
                if (secondMax != null && nums[index] == secondMax) {
                    continue;
                }

                thirdMax = secondMax;
                secondMax = nums[index];
            } else if (thirdMax == null || nums[index] >= thirdMax) {
                thirdMax = nums[index];
            }
        }

        if (thirdMax != null) {
            return thirdMax;
        }

        return firstMax;
    }

    //509. Fibonacci Number
    public int fib(int N) {
        //return calCulateFibonakki(N);

        System.out.println();
        if (N <= 1)
            return N;

        int a = 0, b = 1;

        while (N-- > 1) {
            System.out.println("N :" + N);
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();

        return b;

    }


    // This can occure stackoverflow error
    public int calCulateFibonakki(int N) {
        if (N == 1) {
            return 0;
        } else if (N == 2) {
            return 1;
        }

        return calCulateFibonakki(N - 1) + calCulateFibonakki(N - 2);
    }

    //7. Reverse Integer
    public int reverse(int x) {

        long result = 0;
        while (x != 0) {
            int mod = x % 10;
            result = result * 10 + mod;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;
        else
            return (int) result;
    }

    // 9. Palindrome Number
    public boolean isPalindrome(int x) {

        int originalNumber = x;
        int reverseNumber = 0;

        while (x > 0) {
            int mod = x % 10;
            reverseNumber = reverseNumber * 10 + mod;
            x = x / 10;
        }
        return originalNumber == reverseNumber;

    }

    //58. Length of Last Word
    public int lengthOfLastWord(String s) {

        String[] words = s.trim().split(" ");

        if (words.length == 0) {
            return 0;
        }

        return words[words.length - 1].length();

    }

    ListNode root;

    public ListNode prepareLinkedList() {

        int[] values = {1, 1, 2, 3, 3};

        for (int i = 0; i < values.length; i++) {

            if (root == null) {
                root = new ListNode(values[i]);
                root.next = null;
                continue;
            }

            ListNode lastNode = getLastNode(root);

            lastNode.next = new ListNode(values[i]);
        }

        return root;
    }

    private ListNode getLastNode(ListNode root) {

        if (root.next == null) {
            return root;
        }

        ListNode currentNode = root;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    //83. Remove Duplicates from Sorted List
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode currentNode = head;
        ListNode prevNode = head;

        boolean isSameFound = false;
        while (currentNode.next != null) {
            currentNode = currentNode.next;

            if (prevNode.val != currentNode.val) {
                if (isSameFound) {
                    isSameFound = false;
                    prevNode.next = currentNode;
                }
                prevNode = currentNode;

            } else {
                isSameFound = true;
            }
        }

        if (isSameFound) {
            prevNode.next = null;
        }
        return head;
    }
}
