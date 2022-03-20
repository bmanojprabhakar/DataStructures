package io.tree.bst;

import io.tree.TreeNode;

public class ValidBST {
    TreeNode root;
    public int isValidBST(TreeNode A) {
        return bstUtil(A, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int bstUtil(TreeNode node, int min, int max) {
        if(node==null)
            return 1;
        else if ((node.val < max) && (node.val > min) &&
            bstUtil(node.left, min, node.val)==1 &&
            bstUtil(node.right, node.val, max)==1)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        ValidBST obj = new ValidBST();
        obj.root = new TreeNode(4);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(5);
        obj.root.left.left = new TreeNode(1);
        obj.root.left.right = new TreeNode(5);
        System.out.println(obj.isValidBST(obj.root));
    }
}
