package graph;

import java.util.Map;

public class GraphMain {

    public static void main(String[] args) {
        GraphService graphService=new GraphService();
        graphService.printGraph();

        graphService.addNode(new Node(0));
        graphService.addNode(new Node(1));
        graphService.addNode(new Node(2));
        graphService.addNode(new Node(3));
        graphService.addNode(new Node(4));


        graphService.printGraph();

        graphService.addEdge(0,new Edge(0,1,10,null));
        graphService.addEdge(0,new Edge(0,4,10,null));


        graphService.addEdge(1,new Edge(1,0,10,null));
        graphService.addEdge(1,new Edge(1,2,10,null));
        graphService.addEdge(1,new Edge(1,3,10,null));
        graphService.addEdge(1,new Edge(1,4,10,null));



        graphService.addEdge(2,new Edge(2,1,10,null));
        graphService.addEdge(2,new Edge(2,3,10,null));

        graphService.addEdge(3,new Edge(3,1,10,null));
        graphService.addEdge(3,new Edge(3,2,10,null));
        graphService.addEdge(3,new Edge(3,4,10,null));

        graphService.addEdge(4,new Edge(4,0,10,null));
        graphService.addEdge(4,new Edge(4,1,10,null));
        graphService.addEdge(4,new Edge(4,3,10,null));

        graphService.printGraph();


        Map<Integer,Node> map=graphService.getMap();

        String path=graphService.bfsTraversal(0);

        System.out.println("Path :"+path);


    }
}
