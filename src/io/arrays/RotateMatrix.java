package io.arrays;

import java.util.ArrayList;

public class RotateMatrix {
    public void solve(ArrayList<ArrayList<Integer>> A) {
        System.out.println(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0;i<A.size();i++) {
            ArrayList<Integer> row = new ArrayList<>();
             for(int j=A.size()-1;j>=-0;j--){
                 row.add(A.get(j).get(i));
            }
            result.add(row);
        }
        A.clear();
        A.addAll(result);
        System.out.println(A);
//        printMatrix(result);
    }

    private void printMatrix(ArrayList<ArrayList<Integer>> result) {
        for(int i=0;i<result.size();i++) {
            System.out.println(result.get(i));
        }
    }

    private ArrayList<ArrayList<Integer>> formulateInputMatrix(int A) {
        ArrayList<ArrayList<Integer>> inputMatrix = new ArrayList<>();
        int a = 0;

        for(int i = 1; i<= A; i++) {
            ArrayList<Integer> rowMatrix = new ArrayList<>();
            for(int j = 1; j<= A; j++) {
                rowMatrix.add(++a);
            }

            inputMatrix.add(rowMatrix);
        }
        return inputMatrix;
    }

    public static void main(String[] args) {
        RotateMatrix obj = new RotateMatrix();
        ArrayList<ArrayList<Integer>> input;
        input = obj.formulateInputMatrix(2);
        obj.solve(input);
    }
}
