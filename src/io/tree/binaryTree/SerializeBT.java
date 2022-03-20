package io.tree.binaryTree;

import io.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeBT {
    TreeNode root;
    ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> solve(TreeNode A) {
        if(A == null) {
            result.add(-1);
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node == null)
                result.add(-1);
            else {
                result.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SerializeBT obj = new SerializeBT();
        obj.root = new TreeNode(1);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(3);
        obj.root.left.left = new TreeNode(4);
        obj.root.left.right = new TreeNode(5);
        obj.root.right.right = new TreeNode(6);
        System.out.println(obj.solve(obj.root));
    }
}
