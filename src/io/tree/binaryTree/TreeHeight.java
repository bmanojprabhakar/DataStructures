package io.tree.binaryTree;


import com.scaler.day53.TreeNode;
import io.tree.TreeNode;

public class TreeHeight {
    TreeNode root;

    public int solve(TreeNode A) {
        if(A == null)
            return 0;
        else {
            int leftHeight = solve(A.left);
            int rightHeight = solve(A.right);

            return Math.max(leftHeight, rightHeight)+1;
        }
    }

    public static void main(String[] args) {
        TreeHeight obj = new TreeHeight();
        obj.root = new TreeNode(1);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(3);
        obj.root.left.left = new TreeNode(4);
        obj.root.left.right = new TreeNode(5);
        System.out.println(obj.solve(obj.root));
    }
}

