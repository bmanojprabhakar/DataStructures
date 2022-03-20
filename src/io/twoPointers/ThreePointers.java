package io.twoPointers;

public class ThreePointers {
    public int minimize(final int[] A, final int[] B, final int[] C) {
        int result = Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int k=0;

        while(i<A.length && j<B.length && k<C.length) {
            int minValue = Math.min(Math.min(A[i], B[j]), C[k]);
            int maxValue = Math.max(Math.max(A[i], B[j]), C[k]);
            int diff = maxValue-minValue;

            if(diff < result)
                result = diff;

            if(A[i] == minValue)
                i++;
            else if(B[j] == minValue)
                j++;
            else
                k++;
        }
        return result;
    }
    public static void main(String[] args) {
        ThreePointers obj = new ThreePointers();
        int[] a = new int[]{3,5,6};
        int[] b = new int[]{2};
        int[] c = new int[]{3,4};
        System.out.println(obj.minimize(a,b,c));
    }
}
