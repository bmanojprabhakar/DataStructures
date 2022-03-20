package io.tree.binaryTree;

import io.tree.TreeNode;

public class CheckIfTreesAreSame {
    int last = 0;
    public int solve(int[] A, int[] B, int[] C) {
        if(A.length==0 || B.length==0 || C.length==0)
            return 0;
        TreeNode postOrder = buildBinaryTree(B, A, 0, A.length-1);
//        printTree(postOrder);
        int index = checkPostOrder(postOrder, C, 0);

        if(index==A.length)
            return 1;
        return 0;
    }

    public int checkPostOrder(TreeNode node, int[] postOrder, int idx) {
        if(node==null)
            return idx;
        checkPostOrder(node.left, postOrder, idx);
        checkPostOrder(node.right, postOrder, idx);
        if(node.val == postOrder[idx])
            idx++;
        else
            return -1;
        return idx;
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
        CheckIfTreesAreSame obj = new CheckIfTreesAreSame();

        int[] a = {1, 2, 4, 5, 3};
        int[] b = {4, 2, 5, 1, 3};
        int[] c = {4, 5, 2, 3, 1};

        System.out.println(obj.solve(a,b,c));
    }
}
