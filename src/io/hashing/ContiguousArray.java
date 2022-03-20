package io.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int solve(ArrayList<Integer> A) {
        Map<Integer, Integer> visitedNode = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for(int i=0; i<A.size(); i++) {
            if(A.get(i) == 0)
                A.set(i, -1);
        }

        for(int i=0; i<A.size(); i++) {
            sum += A.get(i);

            if(sum == 0) {
                maxLength = i+1;
            }
            if (visitedNode.containsKey(sum + A.size())) {
                if (maxLength < visitedNode.get(sum + A.size()))
                    maxLength = visitedNode.get(sum + A.size());
            } else {
                visitedNode.put(sum + A.size(), i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        ContiguousArray obj = new ContiguousArray();
        Integer[] arr = {0,0,0,0,0,1,1,1,1,0,0};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
        System.out.println(obj.solve(al));
    }
}
