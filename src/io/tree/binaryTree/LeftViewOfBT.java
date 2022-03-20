package io.tree.binaryTree;

import io.tree.TreeNode;

import java.util.ArrayList;

public class LeftViewOfBT {
    TreeNode root;
    ArrayList<Integer> result = new ArrayList<>();
    int maxLevel = 0;

    public ArrayList<Integer> solve(TreeNode A) {
        return findLeftNode(A, 1);
    }

    public ArrayList<Integer> findLeftNode(TreeNode A, int level) {
        if(A==null)
            return result;

        if(maxLevel < level) {
            result.add(A.val);
            System.out.println(A.val);
            maxLevel = level;
        }

        findLeftNode(A.left, level+1);
        findLeftNode(A.right, level+1);
        return result;
    }

    public static void main(String[] args) {
        LeftViewOfBT obj = new LeftViewOfBT();
        obj.root = new TreeNode(1);
        obj.root.left = new TreeNode(2);
        obj.root.left.right = new TreeNode(4);
        obj.root.left.right.left = new TreeNode(8);
        obj.root.left.right.right = new TreeNode(5);

        obj.root.right = new TreeNode(3);
        /*obj.root.right.left = new TreeNode(6);
        obj.root.right.right = new TreeNode(7);*/
        System.out.println(obj.solve(obj.root));

    }
}
