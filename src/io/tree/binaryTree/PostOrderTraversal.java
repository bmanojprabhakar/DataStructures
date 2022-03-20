package io.tree.binaryTree;

import io.tree.TreeNode;

import java.util.ArrayList;

public class PostOrderTraversal {
    private TreeNode root;
    private ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        if(A==null)
            return result;
        postorderTraversal(A.left);
        postorderTraversal(A.right);
        result.add(A.val);
        return result;
    }

    public static void main(String[] args) {
        PostOrderTraversal obj = new PostOrderTraversal();
        obj.root = new TreeNode(1);
        obj.root.left = new TreeNode(6);
        obj.root.right = new TreeNode(2);
        obj.root.right.left = new TreeNode(3);
        System.out.println(obj.postorderTraversal(obj.root));
    }
}
