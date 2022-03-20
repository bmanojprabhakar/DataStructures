package io.tree.binaryTree;

import com.scaler.day53.TreeNode;
import io.tree.TreeNode;

import java.util.ArrayList;

public class InorderTraversal {
    private TreeNode root;
    ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        if(A==null)
            return result;
        inorderTraversal(A.left);
        result.add(A.val);
        inorderTraversal(A.right);
        return result;
    }

    public static void main(String[] args) {
        InorderTraversal obj = new InorderTraversal();
        obj.root = new TreeNode(1);
        obj.root.left = new TreeNode(6);
        obj.root.right = new TreeNode(2);
        obj.root.right.left = new TreeNode(3);
        System.out.println(obj.inorderTraversal(obj.root));
    }
}
