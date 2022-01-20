package leetCode;

public class RemoveNthNode19 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode tempNode = node;

//        int[] nodeValues = new int[]{2, 3, 4, 5};
        int[] nodeValues = new int[]{2};
        for (int i = 0; i < nodeValues.length; i++) {
            tempNode.next = new ListNode(nodeValues[i]);
            tempNode = tempNode.next;
        }

        System.out.println(removeNthFromEnd(node, 2));

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return head;
        }

        if (head.next == null && n == 1) {
            return null;
        }

        ListNode slowNode = head;
        ListNode fastNode = head;

        while (n > 0) {
            fastNode = fastNode.next;
            n--;
        }

        ListNode prevNode = null;

        if (fastNode == null) {
            head = slowNode.next;
            return head;
        }

        while (fastNode != null) {
            prevNode = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }

        if (prevNode != null) {
            prevNode.next = slowNode.next;
        }
        return head;
    }
}
