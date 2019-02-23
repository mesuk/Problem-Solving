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


        System.out.println();
        System.out.println();

        GraphService graphService2=new GraphService();
        graphService2.printGraph();

        graphService2.addNode(new Node(1));
        graphService2.addNode(new Node(2));
        graphService2.addNode(new Node(3));
        graphService2.addNode(new Node(4));
        graphService2.addNode(new Node(5));
        graphService2.addNode(new Node(6));
        graphService2.addNode(new Node(7));
        graphService2.addNode(new Node(8));
        graphService2.addNode(new Node(9));
        graphService2.addNode(new Node(10));


        graphService2.printGraph();


        graphService2.addEdge(1,new Edge(1,2,10,null));
        graphService2.addEdge(1,new Edge(1,4,10,null));



        graphService2.addEdge(2,new Edge(2,1,10,null));
        graphService2.addEdge(2,new Edge(2,3,10,null));
        graphService2.addEdge(2,new Edge(2,5,10,null));
        graphService2.addEdge(2,new Edge(2,8,10,null));

        graphService2.addEdge(3,new Edge(3,2,10,null));
        graphService2.addEdge(3,new Edge(3,4,10,null));
        graphService2.addEdge(3,new Edge(3,9,10,null));
        graphService2.addEdge(3,new Edge(3,10,10,null));

        graphService2.addEdge(4,new Edge(4,1,10,null));
        graphService2.addEdge(4,new Edge(4,3,10,null));




        graphService2.addEdge(5,new Edge(5,2,10,null));
        graphService2.addEdge(5,new Edge(5,6,10,null));
        graphService2.addEdge(5,new Edge(5,7,10,null));


        graphService2.addEdge(6,new Edge(6,5,10,null));

        graphService2.addEdge(7,new Edge(7,5,10,null));
        graphService2.addEdge(7,new Edge(7,8,10,null));


        graphService2.addEdge(8,new Edge(8,2,10,null));
        graphService2.addEdge(8,new Edge(8,7,10,null));


        graphService2.addEdge(9,new Edge(9,3,10,null));
        graphService2.addEdge(10,new Edge(10,3,10,null));


        graphService2.printGraph();



        String path2=graphService2.bfsTraversal(1);

        System.out.println("Path :"+path2);

    }
}
