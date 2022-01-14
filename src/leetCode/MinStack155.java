package leetCode;

public class MinStack155 {

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(4);
        minStack.push(2);
        minStack.push(1);
        System.out.println("Min : " + minStack.getMin());
        System.out.println("Top : " + minStack.top());
        minStack.pop();
        System.out.println("Top : " + minStack.top());
        minStack.push(0);
        minStack.push(11);
        System.out.println("Min : " + minStack.getMin());
    }

    static class MinStack {
        private Node head;

        public MinStack() {

        }

        public void push(int val) {
            if (head == null) {
                head = new Node(val, val, null);
            } else {
                head = new Node(val, Math.min(val, head.minValue), head);
            }
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.value;
        }

        public int getMin() {
            return head.minValue;
        }

        class Node {
            int value;
            int minValue;
            Node next;

            public Node(int value, int minValue, Node next) {
                this.value = value;
                this.minValue = minValue;
                this.next = next;
            }
        }
    }
}
