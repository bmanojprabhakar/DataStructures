package io.arrays;

import java.util.ArrayList;

public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        for(int row=0;row<A;row++) {
            ArrayList<Integer> rowElements = new ArrayList<>();
            for(int j=0;j<=row;j++) {
                if(j==0 || row==j) {
                    rowElements.add(1);
                } else {
                    rowElements.add(triangle.get(row-1).get(j) +
                            triangle.get(row-1).get(j-1));
                }
            }
            triangle.add(rowElements);
        }
        return triangle;
    }

    public static void main(String[] args) {
        PascalTriangle obj = new PascalTriangle();
        System.out.println(obj.solve(3));
    }
}
