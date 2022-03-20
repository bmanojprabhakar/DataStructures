package io.tree.binaryTree;

import io.tree.TreeNode;

public class DiameterOfBT {
    TreeNode root;

    public int solve(TreeNode A) {
        Height h = new Height();
        return diameter(A, h);
    }

    public int diameter(TreeNode A, Height height) {
        Height lh = new Height();
        Height rh = new Height();

        if(A==null) {
            height.h = 0;
            return 0;
        }

        int leftDia = diameter(A.left, lh);
        int rightDia = diameter(A.right, rh);

        height.h = Math.max(lh.h, rh.h)+1;

        return Math.max(lh.h + rh.h, Math.max(leftDia, rightDia));
    }

    public static void main(String[] args) {
        DiameterOfBT obj = new DiameterOfBT();
        obj.root = new TreeNode(1);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(3);
        obj.root.left.left = new TreeNode(4);
        obj.root.left.right = new TreeNode(5);
        obj.root.right.right = new TreeNode(6);

        System.out.println(obj.solve(obj.root));
    }

    class Height {
        int h;
    }
}
