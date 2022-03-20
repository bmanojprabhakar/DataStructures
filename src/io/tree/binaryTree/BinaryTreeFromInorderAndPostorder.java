package io.tree.binaryTree;

import io.tree.TreeNode;

public class BinaryTreeFromInorderAndPostorder {
    int last = 0;
    public TreeNode buildTree(int[] A, int[] B) {
        if(A.length==0)
            return null;
        last = B.length-1;
        return buildBinaryTree(A, B, 0, B.length-1);
    }

    public TreeNode buildBinaryTree(int[] A, int[] B, int start, int end) {
        if(start > end)
            return null;

        TreeNode root = new TreeNode(B[last--]);

        if(start==end)
            return root;
        int index = fetchIndex(A, start, end, root.val);

        root.right = buildBinaryTree(A,B,index+1,end);
        root.left = buildBinaryTree(A, B, start, index-1);
        return root;
    }

    public int fetchIndex(int[] arr, int start, int end, int val) {
        for(int i=start;i<=end;i++) {
            if(arr[i] == val)
                return i;
        }
        return -1;
    }

    public void printTree(TreeNode node) {
        if(node==null)
            return;
        System.out.println(node.val);
        printTree(node.left);
        printTree(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeFromInorderAndPostorder obj = new BinaryTreeFromInorderAndPostorder();
        int[] a = new int[]{6, 1, 3, 2};
        int[] b = new int[]{6, 3, 2, 1};

        obj.printTree(obj.buildTree(a,b));
    }
}
