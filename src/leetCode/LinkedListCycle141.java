package leetCode;

public class LinkedListCycle141 {

    public static void main(String[] args) {
        // https://leetcode.com/problems/linked-list-cycle/
//        Input: head = [3,2,0,-4], pos = 1
//        Output: true
//        Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

        ListNode node = new ListNode(3);
        ListNode tempNode = node;
        ListNode cycleNode = null;

        int[] nodeValues = new int[]{3, 2, 0, 4};

        for (int i = 1; i < nodeValues.length; i++) {
            tempNode.next = new ListNode(nodeValues[i]);
            if(i==1){
                cycleNode = tempNode.next;
            }
            tempNode = tempNode.next;
        }
        tempNode.next = cycleNode;

        System.out.println(hasCycle(node));
    }

    public static boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;

    }
}
