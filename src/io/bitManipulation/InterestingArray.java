package io.bitManipulation;

public class InterestingArray {
    public String solve(int[] A) {
        int counter = 0;

        for(int i=0;i<A.length;i++) {
            if(A[i]%2!=0)
                counter++;
        }

        if(counter%2!=0)
            return "no";
        return "yes";
    }
    public static void main(String[] args) {
        InterestingArray obj = new InterestingArray();
        int[] arr = new int[]{1};
        System.out.println(obj.solve(arr));
    }
}
