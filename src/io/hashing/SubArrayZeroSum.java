package io.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubArrayZeroSum {
    public int solve(ArrayList<Integer> A) {
        Set<Integer> storeSum = new HashSet<>();
        int sum = 0;

        for(int i=0;i<A.size();i++) {
            sum += A.get(i);

            if (A.get(i) == 0 ||
                    sum == 0 ||
                    storeSum.contains(sum))
                return 1;
            storeSum.add(sum);
        }
        return 0;
    }

    public static void main(String[] args) {
        SubArrayZeroSum obj = new SubArrayZeroSum();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,-2));
        System.out.println(obj.solve(al));
    }
}
