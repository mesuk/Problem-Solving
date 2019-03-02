package binaryTree.binarySearchTree;

import binaryTree.BinaryTreeService;

public class BinarySearchTreeMain {

    public static void main(String[] args) {

        //[3,9,20,null,null,15,7]

        BinarySearchTreeService binaryTreeService=new BinarySearchTreeService();
        binaryTreeService.addNode(7);
        binaryTreeService.addNode(5);
        binaryTreeService.addNode(9);
        binaryTreeService.addNode(8);
        binaryTreeService.addNode(10);
        binaryTreeService.addNode(3);
        binaryTreeService.addNode(6);

        binaryTreeService.printBfs();

        binaryTreeService.addNode(9);
        binaryTreeService.addNode(1);
        binaryTreeService.addNode(4);

        binaryTreeService.printBfs();

    }
}
