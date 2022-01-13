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
        if(head == null){
            return head;
        }

        ListNode tail = null;
        ListNode prevNode = head;

        for(;;){
            if(prevNode.next == null){
                tail = prevNode;
                break;
            }
            tail = head.next;
        }

        while (head.next != null){
            prevNode = head;
            tail =
        }


        ListNode nextNode = head.next;
        ListNode currentNode = null;
        ListNode prevNode = head;
        while(nextNode != null){
            currentNode = nextNode;
            nextNode = nextNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
        }

        return currentNode;

    }
}
