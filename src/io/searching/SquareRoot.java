package io.searching;

public class SquareRoot {
    public int sqrt(int A) {
        int start=1, end=A, result=0;

        while(start<=end) {
            int mid = start + (end-start)/2;

            if(mid <= A/mid) {
                result = mid;
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SquareRoot obj = new SquareRoot();
        System.out.println(obj.sqrt(23));
    }
}
