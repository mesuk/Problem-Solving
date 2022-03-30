package leetCode;

public class PalindromeLinkList {
    //https://leetcode.com/problems/palindrome-linked-list/

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode tempNode = listNode;
        int[] nodeValues = {2, 2, 1};
        for (int i = 0; i < nodeValues.length; i++) {
            tempNode.next = new ListNode(nodeValues[i]);
            tempNode = tempNode.next;
        }

        System.out.println(isPalindrome(listNode));

    }

    public static boolean isPalindrome(ListNode head) {
        return false;

    }

    public static boolean isPalindromeWithExtraSpace(ListNode head) {
        int nodeLength = 0;
        ListNode tempNode = head;
        // find node count
        while (tempNode != null) {
            nodeLength++;
            tempNode = tempNode.next;
        }

        tempNode = head;

        // add values into array
        int[] values = new int[nodeLength];
        int i = 0;
        while (tempNode != null) {
            values[i++] = tempNode.val;
            tempNode = tempNode.next;
        }

        boolean isPalindrome = true;

        int l = 0, r = values.length - 1;

        // palindrome check
        while (l < r) {
            if (values[l] != values[r]) {
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }

        return isPalindrome;
    }
}
