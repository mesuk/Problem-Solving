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

        System.out.println();
        binaryTreeService=new BinaryTreeService();


        /*1
        2 2
        3 4 4 3*/
        binaryTreeService.addNode(1);
        binaryTreeService.addNode(2);
        binaryTreeService.addNode(2);
        binaryTreeService.addNode(3);
        binaryTreeService.addNode(4);
        binaryTreeService.addNode(4);
        binaryTreeService.addNode(3);

        binaryTreeService.printBfs();

        System.out.println();

        boolean isSymmetric=binaryTreeService.isSymmetric();
        System.out.println("isSymmetric :"+isSymmetric);

    }
}
