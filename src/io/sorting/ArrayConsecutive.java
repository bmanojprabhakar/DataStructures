package io.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayConsecutive {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int result = 1;
        int num = A.get(0);

        for(int i=0;i<A.size();i++) {
            if(A.get(i) != i+num) {
                result = 0;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayConsecutive obj = new ArrayConsecutive();
        ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(7,8,9,10,12));
        System.out.println(obj.solve(ls));
    }
}
