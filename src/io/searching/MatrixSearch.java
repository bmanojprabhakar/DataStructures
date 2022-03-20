package io.searching;

public class MatrixSearch {
    public int searchMatrix(int[][] A, int B) {
        if(A.length == 0)
            return 0;

        int rowLength = A[0].length-1;

        for(int i=0;i<A.length;i++) {
            if(B == A[i][rowLength])
                return 1;
            if(B < A[i][rowLength])
                return searchInRow(A[i], B);
        }
        return 0;
    }

    private int searchInRow(int[] arr, int target) {
        for(int i: arr) {
            if(i == target)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        MatrixSearch obj = new MatrixSearch();
        int[][] arr = new int[][]{
                {1},
        };
        System.out.println(obj.searchMatrix(arr, 1));
    }
}
