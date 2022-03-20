package io.tree.binaryTree;

import io.tree.TreeNode;

import java.util.ArrayList;

public class BoundaryTraversalBT {
    TreeNode root;
    ArrayList<Integer> boundaryValues = new ArrayList<>();

    public ArrayList<Integer> solve(TreeNode A) {
        if(A == null)
            return boundaryValues;

        boundaryValues.add(A.val);
        findLeftBoundary(A.left);
        findLeafNodes(A.left);
        findLeafNodes(A.right);
        findRightBoundary(A.right);
        return boundaryValues;
    }

    void findLeafNodes(TreeNode node) {
        if(node==null)
            return;

        findLeafNodes(node.left);
        if(node.left==null && node.right==null)
            boundaryValues.add(node.val);
        findLeafNodes(node.right);
    }

    void findLeftBoundary(TreeNode node) {
        if(node==null)
            return;

        if(node.left!=null) {
            boundaryValues.add(node.val);
            findLeftBoundary(node.left);
        } else if(node.right!=null) {
            boundaryValues.add(node.val);
            findLeftBoundary(node.right);
        }
    }

    void findRightBoundary(TreeNode node) {
        if(node == null)
            return;

        if(node.right!=null) {
            boundaryValues.add(node.val);
            findRightBoundary(node.right);
        } else if(node.left != null) {
            boundaryValues.add(node.val);
            findRightBoundary(node.left);
        }
    }

    public static void main(String[] args) {
        BoundaryTraversalBT obj = new BoundaryTraversalBT();
        obj.root = new TreeNode(1);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(3);
        obj.root.left.left = new TreeNode(4);
        obj.root.left.right = new TreeNode(5);
        obj.root.right.right = new TreeNode(6);

        System.out.println(obj.solve(obj.root));
    }
}

/**
 *      1
 *    2   3
 *  4  5    6
 */
