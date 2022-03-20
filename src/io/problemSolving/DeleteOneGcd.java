package io.problemSolving;

public class DeleteOneGcd {
    public int solve(int[] A) {
        int n = A.length;
        int[] prefix = new int[n+2];
        int[] suffix = new int[n+2];

        prefix[1] = A[0];
        for (int i=2; i<= n; i++) {
            prefix[i] = calculateGcd(prefix[i - 1], A[i - 1]);
        }

        suffix[n] = A[n-1];
        for (int i=n-1;i>=1;i--)
            suffix[i] = calculateGcd(suffix[i + 1], A[i - 1]);

        int result = Math.max(suffix[2], prefix[n-1]);

        for(int i=2;i<n;i++)
            result = Math.max(result, calculateGcd(prefix[i-1], suffix[i+1]));

        return result;
    }

    private int calculateGcd(int a, int b) {
        if(b == 0)
            return a;
        return calculateGcd(b, a%b);
    }

    public static void main(String[] args) {
        DeleteOneGcd obj = new DeleteOneGcd();
        int[] arr = new int[]{12,15,18};
        System.out.println(obj.solve(arr));
    }
}
