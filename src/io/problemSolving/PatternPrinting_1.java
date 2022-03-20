package io.problemSolving;

import java.util.ArrayList;

public class PatternPrinting_1 {
    ArrayList<ArrayList<Integer>> completeList = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> solve(int A) {
        for(int i=1; i<=A; i++) {
            ArrayList<Integer> finalList = new ArrayList<>();
            for(int j=1; j<=A; j++) {
                finalList.add(j);

                if(i==j)
                    break;
            }
            completeList.add(finalList);
        }
        return completeList;
    }

    public static void main(String[] args) {
        PatternPrinting_1 obj = new PatternPrinting_1();
        System.out.println(obj.solve(1));
    }
}
