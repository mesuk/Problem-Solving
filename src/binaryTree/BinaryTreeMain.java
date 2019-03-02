package binaryTree;

public class BinaryTreeMain {

    public static void main(String[] args) {

        //[3,9,20,null,null,15,7]

        BinaryTreeService binaryTreeService=new BinaryTreeService();
        binaryTreeService.addNode(3);
        binaryTreeService.addNode(9);
        binaryTreeService.addNode(20);
        binaryTreeService.addNode(null);
        binaryTreeService.addNode(null);
        binaryTreeService.addNode(15);
        binaryTreeService.addNode(7);

        binaryTreeService.printBfs();
    }
}
