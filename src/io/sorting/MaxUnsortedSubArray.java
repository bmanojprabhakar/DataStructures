package io.sorting;

import java.util.Arrays;

public class MaxUnsortedSubArray {
    public int[] subUnsort(int[] A) {
        int n = A.length, start = 0, end = n-1, i, max, min;

        for(start=0;start<n-1;start++) {
            if(A[start] > A[start+1])
                break;
        }

        if (start == n-1) {
            return new int[]{-1};
        }

        for(end=n-1;end>0;end--) {
            if(A[end] < A[end-1])
                break;
        }

        max = A[start];
        min = A[end];

        for(i=start+1;i<end;i++) {
            if(A[i] > max)
                max = A[i];
            if(A[i] < min)
                min = A[i];
        }

        for(i=0; i<start; i++) {
            if(A[i] > min) {
                start=i;
                break;
            }
        }

        for(i=n-1;i>end;i--) {
            if(A[i] < max) {
                end = i;
                break;
            }
        }

        return new int[]{start,end};
    }
    public static void main(String[] args) {
        MaxUnsortedSubArray obj = new MaxUnsortedSubArray();
        int[] arr = new int[]{10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        System.out.println(Arrays.toString(obj.subUnsort(arr)));
    }

}
