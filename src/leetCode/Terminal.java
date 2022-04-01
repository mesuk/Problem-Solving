package leetCode;

public class Terminal {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        int[] nodeValues = new int[]{1, 3, 8, 10, 5, 100, 7}; // cycle at 10
        ListNode tempNode, cycleNode = null;
        tempNode = head;
        for (int i = 1; i < nodeValues.length; i++) {
            tempNode.next = new ListNode(nodeValues[i]);
            if (i == 3) {
                cycleNode = tempNode.next;
            }
            tempNode = tempNode.next;
        }
        tempNode.next = cycleNode;

        System.out.println(hasCycle(head));
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
