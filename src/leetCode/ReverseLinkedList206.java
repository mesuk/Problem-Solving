package leetCode;

public class ReverseLinkedList206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        int[] nodeValues = new int[]{2, 3, 4, 5};
        ListNode currentHead = head;
        ListNode tempNode = null;

        for (int i = 0; i < nodeValues.length; i++) {
            tempNode = new ListNode(nodeValues[i]);
            currentHead.next = tempNode;
            currentHead = currentHead.next;
        }
        System.out.println(reverseList(head));
    }

    public static ListNode reverseList(ListNode head) {

        ListNode prevNode = null;
        ListNode nextNode = null;
        while (head != null) {
            nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        return prevNode;

    }
}
