package io.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TimeToEquality {
    public int solve(ArrayList<Integer> A) {
        int count = 0;
        int max = Collections.max(A);

        for(int i: A) {
            count += (max - i);
        }
        return count;
    }

    public static void main(String[] args) {
        TimeToEquality obj = new TimeToEquality();
        Integer[] ar = {2,4,1,3,2};
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.addAll(Arrays.asList(ar));
        System.out.println(obj.solve(al));
    }
}
