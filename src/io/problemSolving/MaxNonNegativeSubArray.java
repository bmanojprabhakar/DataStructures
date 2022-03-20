package io.problemSolving;

import java.util.*;

public class MaxNonNegativeSubArray {
    private ArrayList<Integer> sumOfValues = new ArrayList<>();
    private Map<Long, ArrayList<Integer>> map= new HashMap<>();
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        long sum = 0;
        for(int i=0;i<A.size();i++) {
            if(A.get(i)>=0) {
                sumOfValues.add(A.get(i));

                if(i==A.size()-1) {
                    findSubArray();
                }
            } else {
                if(sumOfValues.size()>0) {
                    findSubArray();
                }
            }
        }
        if(map.size()>0)
            return map.get(Collections.max(map.keySet()));
        else {
            return sumOfValues;
        }
    }

    private void findSubArray() {
        long sum;
        sum = addList(sumOfValues);
        if (map.containsKey(sum)) {
            if (map.get(sum).size() < sumOfValues.size())
                map.put(sum, sumOfValues);
            else if (map.get(sum).size() == sumOfValues.size()) {
                if (map.get(sum).get(0) > sumOfValues.get(0))
                    map.put(sum, sumOfValues);
            }

        } else {
            map.put(sum, sumOfValues);
        }
        sumOfValues = new ArrayList<>();
    }

    private long addList(ArrayList<Integer> list) {
        long sum = 0;
        for(long i: list) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        MaxNonNegativeSubArray obj = new MaxNonNegativeSubArray();
        ArrayList<Integer> list1 = new ArrayList<>();
        Integer[] arr = {10, -1, 2, 3, -4, 100};
//        Integer[] arr = {336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421};
        list1.addAll(Arrays.asList(arr));
        System.out.println(obj.maxset(list1));
    }
}
