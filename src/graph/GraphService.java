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

    public Edge addEdge(int nodeName,Edge mewEdge){

        if(mewEdge==null){
            System.out.println("Edge cannot be null");
            return null;
        }

        boolean isEdgeValid=false;
        Node effectiveNode=null;
        for (int nodeNameTemp:map.keySet()) {
            if(nodeNameTemp==nodeName){
                System.out.println("Edge :"+nodeNameTemp+" is valid");
                isEdgeValid=true;

                effectiveNode=map.get(nodeNameTemp);
                break;
            }
        }

        if(!isEdgeValid){
            System.out.println("Edge is invalid");
            return null;
        }

        effectiveNode.addEdge(mewEdge);

        return mewEdge;
    }

    public void printGraph(){
        if(map==null){
            System.out.println("Map is null");
            return;
        }

        for (Node node:map.values()) {
            printGraph(node);
        }
    }

    public void printGraph(Node startNode){

        if(startNode==null){
            System.out.println("Node is null");
            return;
        }

        System.out.println("Printing :"+startNode.getNodeName());

        System.out.println();
        System.out.print(""+startNode.getNodeName()+" ->");

        Edge currentNode=startNode.getHead();

        while (currentNode!=null){
            System.out.print(""+currentNode.getValue()+" ->");
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
}
