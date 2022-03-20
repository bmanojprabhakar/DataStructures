package io.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class OddEvenSubsequence {
    public int solve(ArrayList<Integer> A) {
        int count = 0;
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(A);
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            int first = iterator.next();
            int second = 0;
            if(iterator.hasNext())
                second = iterator.next();
            else
                break;

            if( (first%2==0 && second%2!=0) ||
                    (first%2!=0 && second%2==0))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        OddEvenSubsequence obj = new OddEvenSubsequence();
        Integer[] ar = {12, 10, 28, 37, 43, 40, 14, 12, 48};
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.addAll(Arrays.asList(ar));
        System.out.println(obj.solve(al));
    }

    
}
