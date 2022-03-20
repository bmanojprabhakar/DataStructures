package io.searching;

public class SingleElement {
    public int solve(int[] A) {
        int l=0, h=A.length-1, mid;

        if(h==0)
            return A[0];
        if(A[0]!=A[1])
            return A[0];
        if(A[h]!=A[h-1])
            return A[h];

        while(l<=h) {
            mid = (l+h)/2;

            if(A[mid]!=A[mid-1] && A[mid]!=A[mid+1])
                return A[mid];
            if((mid%2==0 && A[mid]==A[mid+1]) || (mid%2==1 && A[mid]==A[mid-1]))
                l = mid+1;
            else
                h = mid-1;
        }

        return -1;
    }

    public static void main(String[] args) {
        SingleElement obj = new SingleElement();
        int[] arr = new int[]{1,1,2,3,3,4,4,8,8};
        System.out.println(obj.solve(arr));
    }
}
