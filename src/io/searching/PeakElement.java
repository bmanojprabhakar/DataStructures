package io.searching;

public class PeakElement {
    public int solve(int[] A) {
        int l=0, h=A.length-1, mid = 0;

        while(l<=h) {
            mid = (l+h)/2;

            if((mid==0 || A[mid]>A[mid-1]) &&
                    (mid==A.length-1 || A[mid]>A[mid+1]))
                break;
            else if (mid>0 && A[mid-1] > A[mid])
                h = mid-1;
            else
                l = mid+1;
        }
        return A[mid];
    }

    public static void main(String[] args) {
        PeakElement obj = new PeakElement();
        int[] arr = new int[] {2,3};
        System.out.println(obj.solve(arr));
    }
}
