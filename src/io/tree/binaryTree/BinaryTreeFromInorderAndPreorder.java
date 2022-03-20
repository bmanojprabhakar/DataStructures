package io.tree.binaryTree;

import io.tree.TreeNode;

public class BinaryTreeFromInorderAndPreorder {
    int last = 0;
    public TreeNode buildTree(int[] A, int[] B) {
        if(A.length==0)
            return null;
        last = 0;
        return buildBinaryTree(B, A, 0, B.length-1);
    }

    public TreeNode buildBinaryTree(int[] A, int[] B, int start, int end) {
        if(start > end)
            return null;
        if(end == B.length)
            return  null;
        TreeNode root = new TreeNode(B[last++]);

        if(start==end)
            return root;
        int index = fetchIndex(A, start, end, root.val);

        root.left = buildBinaryTree(A, B, start, index-1);
        root.right = buildBinaryTree(A,B,index+1,end);
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

        printTree(node.left);
        printTree(node.right);
        System.out.println(node.val);
    }

    public static void main(String[] args) {
        BinaryTreeFromInorderAndPreorder obj = new BinaryTreeFromInorderAndPreorder();
        int[] a = new int[]{1, 6, 2, 3};
        int[] b = new int[]{6, 1, 3, 2};

        obj.printTree(obj.buildTree(a,b));
    }
}
