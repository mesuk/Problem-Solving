package binaryTree.binarySearchTree;

public class BinarySearchTreeMain {

    public static void main(String[] args) {

        //[3,9,20,null,null,15,7]

        BinarySearchTreeService binaryTreeService=new BinarySearchTreeService();

        /*7
        5 9
        3 6 8 10*/

        binaryTreeService.addNode(7);
        binaryTreeService.addNode(5);
        binaryTreeService.addNode(9);
        binaryTreeService.addNode(8);
        binaryTreeService.addNode(10);
        binaryTreeService.addNode(3);
        binaryTreeService.addNode(6);

        binaryTreeService.printBfs();

        /*Level Order

        7
        5 9
        3 6 8 10
        1 4 9
            */
        binaryTreeService.addNode(9);
        binaryTreeService.addNode(1);
        binaryTreeService.addNode(4);

        binaryTreeService.printBfs();

    }
}
