package graph;

import java.util.HashMap;
import java.util.Map;

public class GraphService {

    private Map<Integer,Node> map=new HashMap<>();

    public GraphService() {
    }

    public int addNode(Node node){

        if(node ==null){
            System.out.println("Node cannot be null");
            return -1;
        }

        for (int nodeName:map.keySet()) {
            if(nodeName==node.getNodeName()){
                System.out.println("Node :"+nodeName+" already added in list");
                return nodeName;
            }
        }

        map.put(node.getNodeName(),node);

        return node.getNodeName();

    }

    public Edge addEdge(int nodeName,Edge newEdge){

        if(newEdge==null){
            System.out.println("Edge cannot be null");
            return null;
        }

        Node sourceNode=isValidNode(nodeName);

        if(sourceNode==null){
            System.out.println("Source node is invalid");
            return null;
        }

        Node destinationNode=isValidNode(newEdge.getDestination());

        if(destinationNode==null){
            System.out.println("Destination node is invalid");
            return null;
        }

        sourceNode.addEdge(newEdge);
        destinationNode.addEdge(new Edge(destinationNode.getNodeName(),sourceNode.getNodeName(),newEdge.getWeight(),null));

        return newEdge;
    }

    public void printGraph(){
        if(map==null){
            System.out.println("Map is null");
            return;
        }
        System.out.println();

        System.out.println("Printing whole graph");

        for (Node node:map.values()) {
            Edge currentNode=node.getHead();

            System.out.print(""+node.getNodeName()+" --> ");

            while (currentNode!=null){
                System.out.print(" "+currentNode.getDestination());
                currentNode=currentNode.getNext();

                if(currentNode!=null){
                    System.out.print(" -> ");
                }else{
                    System.out.println();
                }

            }
        }

        System.out.println();
    }

    public void printGraph(Node startNode){

        if(startNode==null){
            System.out.println("Node is null");
            return;
        }

        System.out.println();

        System.out.println("Printing :"+startNode.getNodeName());

        System.out.println();
        System.out.print(""+startNode.getNodeName()+" ->");

        Edge currentNode=startNode.getHead();

        while (currentNode!=null){
            System.out.print(""+currentNode.getDestination()+" ->");
            currentNode=currentNode.getNext();
        }

        System.out.println();

    }

    public Map<Integer, Node> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Node> map) {
        this.map = map;
    }

    private Node isValidNode(int nodeName){

        boolean isEdgeValid=false;
        Node effectiveNode=null;

        for (int nodeNameTemp:map.keySet()) {
            if(nodeNameTemp==nodeName){
                isEdgeValid=true;

                effectiveNode=map.get(nodeNameTemp);
                break;
            }
        }

        if(!isEdgeValid){
            return null;
        }
        return effectiveNode;

    }
}
