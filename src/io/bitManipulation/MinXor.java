package io.bitManipulation;

import java.util.Arrays;

public class MinXor {
    public int findMinXor(int[] A) {
        int minValue = Integer.MAX_VALUE;
        Arrays.sort(A);

        for(int i=0;i<A.length-1;i++) {
            minValue = Math.min(minValue, A[i]^A[i+1]);
        }
        return minValue;
    }

    public static void main(String[] args) {
        MinXor obj = new MinXor();
        int[] arr = new int[]{0, 4, 7, 9};
        System.out.println(obj.findMinXor(arr));
    }
}
