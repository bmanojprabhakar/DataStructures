package io.hashing;

import java.util.*;

public class TwoSum {
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> visitedNode = new HashMap<>();

        for(int i=0;i<A.size(); i++) {
            int index = B-A.get(i);
            if(visitedNode.containsKey(index)) {
                result.add(visitedNode.get(index));
                result.add(i+1);
                break;
            }
            visitedNode.putIfAbsent(A.get(i), i+1);
        }

        return result;
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
//        Integer[] arr = {4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
        Integer[] arr = {2,2,2,2,3,3,3};
        System.out.println(obj.twoSum(Arrays.asList(arr), 5));
    }
}
