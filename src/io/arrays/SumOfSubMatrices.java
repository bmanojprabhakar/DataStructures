package io.arrays;

public class SumOfSubMatrices {
    public int solve(int[][] A) {
        int sum = 0;
        int n = A.length;

        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                int leftPtr = (i+1) * (j+1);
                int rightPtr = (n-i) * (n-j);
                sum += (leftPtr*rightPtr*A[i][j]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfSubMatrices obj = new SumOfSubMatrices();
        int[][] arr = {{1,1,1}, {1,1,1}, {1,1,1}};
        System.out.println(obj.solve(arr));
    }
}
