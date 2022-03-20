package io.tree.binaryTree;

import io.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagBT {
    TreeNode root;
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        if(A==null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);

        while(true) {
            int nodeLength = queue.size();
            if(nodeLength==0)
                break;
            ArrayList<Integer> values = new ArrayList<>();

            while(nodeLength>0) {
                TreeNode node = queue.poll();
                values.add(node.val);

                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);

                nodeLength--;
            }

            if(result.size()%2 != 0)
                Collections.reverse(values);

            result.add(values);
        }
        return result;
    }

    public static void main(String[] args) {
        ZigZagBT obj = new ZigZagBT();
        obj.root = new TreeNode(1);
        obj.root.left = new TreeNode(6);
        obj.root.right = new TreeNode(2);
        obj.root.right.left = new TreeNode(3);
//        obj.root.right.right = new TreeNode(7);
        System.out.println(obj.zigzagLevelOrder(obj.root));
    }
}
