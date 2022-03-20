package io.tree.bst;

import com.scaler.day53.TreeNode;

public class ArrayToBBST {
    public TreeNode sortedArrayToBST(final int[] A) {
        return findRootNode(A, 0, A.length-1);
    }

    private TreeNode findRootNode(int[] arr, int start, int end) {
        if(start > end)
            return null;

        int mid = (start+end)/2;

        TreeNode node = new TreeNode(arr[mid]);
        node.left = findRootNode(arr, start, mid-1);
        node.right = findRootNode(arr, mid+1, end);
        return node;
    }

    private void preOrderTraversal(TreeNode node) {
        if(node == null)
            return;
        System.out.println(node.val);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        ArrayToBBST obj = new ArrayToBBST();
        int[] arr = {1,2,3,4,5,6,7};
        obj.preOrderTraversal(obj.sortedArrayToBST(arr));
    }
}
