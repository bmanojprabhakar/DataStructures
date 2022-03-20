package io.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Atleast2GreaterElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> greaterElementList = new ArrayList<>();
        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.addAll(A);
        Collections.sort(sortedList);

        int secondMaxValue = sortedList.get(sortedList.size()-2);
        int maxValue = sortedList.get(sortedList.size()-1);

        for(int i=0; i<A.size();i++) {
            if(A.get(i)!=secondMaxValue && A.get(i)!=maxValue)
                greaterElementList.add(A.get(i));
        }
        return greaterElementList;
    }

    public ArrayList<Integer> solve2(ArrayList<Integer> A) {
        ArrayList<Integer> greaterElementList = new ArrayList<>();

        for(int i=0;i<A.size();i++) {
            int count = 0;
            for(int j=0;j<A.size();j++) {
                if((i == j) || (greaterElementList.contains(A.get(j))))
                    continue;
                if(A.get(i) < A.get(j)) {
                    count++;
                    if(count>1) {
                        greaterElementList.add(A.get(i));
                        break;
                    }
                }

            }
        }

        return greaterElementList;
    }

    public static void main(String[] args) {
        Atleast2GreaterElements obj = new Atleast2GreaterElements();
        Integer[] arr = {5, 17, 100, 11};
        ArrayList<Integer> al = new ArrayList<>();
        al.addAll(Arrays.asList(arr));
        System.out.println(obj.solve(al));
    }
}
