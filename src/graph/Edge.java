package graph;

public class Edge {
    private int source;
    private int destination;
    private int weight;
    private Edge next;

    public Edge(int source, int destination, int weight, Edge next) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        this.next = next;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
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
