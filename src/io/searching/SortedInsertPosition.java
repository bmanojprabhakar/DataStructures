package io.searching;

public class SortedInsertPosition {
    public int searchInsert(int[] A, int B) {
        int l = 0, h = A.length-1, mid=0;

        while(l<=h) {
            mid = (l+h)/2;
            if(A[mid]==B)
                return mid;
            else if (B < A[mid])
                h = mid-1;
            else
                l = mid+1;
        }
        return l;
    }
    public static void main(String[] args) {
        SortedInsertPosition obj = new SortedInsertPosition();
        int[] arr = new int[]{1};
        System.out.println(obj.searchInsert(arr, 1));
    }
}
