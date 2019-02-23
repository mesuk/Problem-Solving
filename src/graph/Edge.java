package graph;

public class Edge {
    private int value;
    private int weight;
    private Edge next;

    public Edge(int value, int weight, Edge next) {
        this.value = value;
        this.weight = weight;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Edge getNext() {
        return next;
    }

    public void setNext(Edge next) {
        this.next = next;
    }
}
