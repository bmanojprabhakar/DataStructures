package io.twoPointers;

import java.util.HashSet;
import java.util.Set;

public class CountSubArrays {
    public int solve(int[] A) {
        int result = 0, j=0;
        int n = A.length;
        Set<Integer> frequency = new HashSet<>();

        for(int i=0;i<n&&j<n;i++) {
            while(j<n && !frequency.contains(A[j])) {
                frequency.add(A[i]);
                j++;
            }
            result += (j-i+1);
            frequency.remove(A[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        CountSubArrays obj = new CountSubArrays();
        int[] arr = new int[]{3,2,5,3,2};
        System.out.println(obj.solve(arr));
    }
}
