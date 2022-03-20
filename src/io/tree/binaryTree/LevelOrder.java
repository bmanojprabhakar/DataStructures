package io.tree.binaryTree;

import io.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    TreeNode root;
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        if(A==null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);

        while(true) {
            int nodeLength = queue.size();
            if(nodeLength == 0)
                break;
            ArrayList<Integer> levelElements = new ArrayList<>();
            while(nodeLength > 0) {
                TreeNode node = queue.peek();

                levelElements.add(node.val);
                queue.remove();

                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);

                nodeLength--;
            }
            result.add(levelElements);
        }
        return result;
    }

    public static void main(String[] args) {
        LevelOrder obj = new LevelOrder();
        obj.root = new TreeNode(3);
        obj.root.left = new TreeNode(9);
        obj.root.right = new TreeNode(20);
        obj.root.right.left = new TreeNode(15);
        obj.root.right.right = new TreeNode(7);

        System.out.println(obj.levelOrder(obj.root));
    }
}
