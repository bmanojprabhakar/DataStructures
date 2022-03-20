package io.problemSolving;

import java.util.Arrays;

public class MinDiffPuzzle {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        System.out.println(A.length);
        Arrays.stream(A).forEach(e -> System.out.print(e + " "));
        int minDiff = Integer.MAX_VALUE;
        int idx = 0;

        while(idx < A.length-B) {
            int diff = Math.abs(A[idx]-A[idx+B-1]);
            minDiff = Math.min(minDiff, diff);
            idx++;
        }

        if(minDiff == Integer.MAX_VALUE)
            minDiff = 0;

        return minDiff;
    }

    public static void main(String[] args) {
        MinDiffPuzzle obj = new MinDiffPuzzle();
        int[] arr = new int[]{759, 106, 827, 279, 722, 954, 80, 577, 273, 538, 963, 296, 693, 694, 684, 406, 603, 192, 166, 233, 310, 969, 980, 36, 322, 409, 392, 824, 422, 729, 76, 532, 186, 902, 811, 907, 855};
        System.out.println(obj.solve(arr, 16));
    }
}
