package graph;


public class Node {
    private int nodeName;
    private Edge head =null;


    public Node(int nodeName) {
        this.nodeName = nodeName;
    }

    public int getNodeName() {
        return nodeName;
    }

    public void setNodeName(int nodeName) {
        this.nodeName = nodeName;
    }


    public Edge getHead() {
        return head;
    }

    public void setHead(Edge head) {
        this.head = head;
    }

    public Edge addEdge(Edge edge){

        if(edge ==null){
            System.out.println("Edge cannot be null");
            return null;
        }

        edge.setNext(null);

        if(head==null){
            head= edge;
            return head;
        }

        Edge currentEdge=head;
        Edge lastEdge=head;

        boolean isNodeAlreadyAdded=false;

        while (currentEdge!=null){

            if(currentEdge.getDestination()==edge.getDestination() ){
                isNodeAlreadyAdded=true;
                break;
            }

            lastEdge=currentEdge;
            currentEdge=currentEdge.getNext();
        }

        if(isNodeAlreadyAdded){
            System.out.println("Edge already added.");
            return edge;
        }

        System.out.println("Edge is new. so adding .");

        lastEdge.setNext(edge);
        return edge;
    }
}
