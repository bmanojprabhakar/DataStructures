package io.tree.binaryTree;

import io.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class DeserializeBT {
    static int idx;
    public TreeNode solve(int[] A) {
        if(A.length == 0)
            return null;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = getNode(A[0]);
        idx = 1;
        queue.add(root);

        while (!queue.isEmpty() && idx<A.length) {
            TreeNode node = queue.poll();
            TreeNode left = getNode(A[idx++]);

            if(left!=null) {
                node.left = left;
                queue.offer(left);
            }

            if(idx < A.length) {
                TreeNode right = getNode(A[idx++]);
                if(right!=null) {
                    node.right = right;
                    queue.offer(right);
                }
            }
        }
        return root;
    }

    private TreeNode getNode(int i) {
        return i==-1?null:new TreeNode(i);
    }

    public static void main(String[] args) {
        DeserializeBT obj = new DeserializeBT();
        int[] arr = {1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1};
        TreeNode node = obj.solve(arr);
        System.out.println(node.val);
    }
}
