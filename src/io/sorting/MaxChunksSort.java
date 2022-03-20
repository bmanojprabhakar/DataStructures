package io.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxChunksSort {
    public int solve(ArrayList<Integer> A) {
        int result = 0;
        int max = 0;

        for(int i=0;i<A.size();i++) {
            max = Math.max(max, A.get(i));

            if(max == i)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        MaxChunksSort obj = new MaxChunksSort();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 0, 3, 4, 6, 5 ));
        System.out.println(obj.solve(al));
    }
}
