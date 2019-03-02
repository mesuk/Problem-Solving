package binaryTree.binarySearchTree;

import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTreeService {

    private TreeNode root;

    public BinarySearchTreeService() {

    }

    public void addNode(Integer value) {
        //[3,9,20,null,null,15,7]
        if (root == null) {
            root = new TreeNode(value);
            return;
        }

        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);

        TreeNode lastNode = new TreeNode(value);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            if (currentNode.val > value) {

                if (currentNode.left == null) {
                    currentNode.left = lastNode;
                    break;
                }
                queue.add(currentNode.left);
                continue;

            } else {
                if (currentNode.right == null) {
                    currentNode.right = lastNode;
                    break;
                }
                queue.add(currentNode.right);
                continue;
            }
        }
    }

    public void printBfs() {
        //[3,9,20,null,null,15,7]

        List<List<Integer>> result = levelOrder(root);
        System.out.println();

        System.out.println("Printing BFS : Level Order");
        result.forEach(levelResult -> {
            System.out.println();
            levelResult.forEach(item -> {
                System.out.print("" + item + " ");
            });

        });

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        //LeetCode 102. Binary Tree Level Order Traversal
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(level);
        }

        return result;
    }

}
