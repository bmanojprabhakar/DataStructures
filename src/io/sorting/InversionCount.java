package io.sorting;

import java.util.Arrays;

public class InversionCount {
    public int solve(int[] A) {
        return mergeSort(A, 0, A.length-1);
    }

    private static int mergeSort(int[] arr, int l, int r) {
        long count = 0;
        if(l<r) {
            int m = (l+r)/2;
            count += mergeSort(arr, l, m);
            count += mergeSort(arr, m+1, r);
            count += inversionCount(arr, l, m, r);
        }
        return  (int) (count%1000000007);
    }

    private static int inversionCount(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m+1);
        int[] right = Arrays.copyOfRange(arr, m+1, r+1);
        int i=0, j=0, k=l, invert=0;

        while(i<left.length && j<right.length) {
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else {
                arr[k++] = right[j++];
                invert += (m + 1) - (i + l);
            }
        }
        while(i<left.length)
            arr[k++] = left[i++];
        while(j< right.length)
            arr[k++] = right[j++];
        return invert;
    }

    public static void main(String[] args) {
        InversionCount obj = new InversionCount();
        int[] arr = new int[]{1, 20, 6, 4, 5 };
        System.out.println(obj.solve(arr));
    }
}
