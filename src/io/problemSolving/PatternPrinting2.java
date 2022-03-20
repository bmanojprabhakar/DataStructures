package io.problemSolving;


import java.util.ArrayList;

public class PatternPrinting2 {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> solve(int A) {
        for(int i=0;i<A;i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<(A-i-1);j++) {
                temp.add(0);
            }
            for(int k=(A-i);k<=A;k++) {
                temp.add(A-k+1);
            }
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        PatternPrinting2 obj = new PatternPrinting2();
        System.out.println(obj.solve(0));
    }
}
