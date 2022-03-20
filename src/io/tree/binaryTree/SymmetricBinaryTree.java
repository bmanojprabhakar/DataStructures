package io.tree.binaryTree;

import com.scaler.day53.TreeNode;
import io.tree.TreeNode;

public class SymmetricBinaryTree {
    TreeNode root;
    private boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if(node1==null && node2==null)
            return true;
        if(node1!=null && node2!=null && node1.val==node2.val)
            return (isSymmetric(node1.left, node2.right) &&
                    isSymmetric(node1.right, node2.left));
        return false;
    }

    public int isSymmetric(TreeNode A) {
        if(A==null)
            return 1;
        return isSymmetric(A.left, A.right) ?1:0;
    }

    public static void main(String[] args) {
        SymmetricBinaryTree obj = new SymmetricBinaryTree();
        obj.root = new TreeNode(1);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(2);
        obj.root.left.left = new TreeNode(3);
        obj.root.left.right = new TreeNode(4);
        obj.root.right.left = new TreeNode(4);
        obj.root.right.right = new TreeNode(5);
        System.out.println(obj.isSymmetric(obj.root));
    }

}
