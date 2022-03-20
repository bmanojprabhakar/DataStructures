package io.arrays;

import java.util.ArrayList;

public class MatrixSearch {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int logicalValue = -1;

        int rowPointer = 0;
        int columnPointer = A.get(0).size()-1;

        while(true) {
            if(rowPointer == A.size()-1 &&
                    columnPointer == A.get(0).size()-1) {
                if(A.get(rowPointer).get(columnPointer) == B) {
                    logicalValue = (rowPointer + 1) * 1009 + (columnPointer + 1);
                }
                break;
            }
            if(A.get(rowPointer).get(columnPointer) == B) {
                logicalValue = (rowPointer+1)*1009 + (columnPointer+1);
                break;
            } else if(A.get(rowPointer).get(columnPointer) > B) {
                columnPointer--;
            } else if(A.get(rowPointer).get(columnPointer) < B) {
                rowPointer++;
            }
        }

        return logicalValue;
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
        MatrixSearch obj = new MatrixSearch();
        ArrayList<ArrayList<Integer>> input = obj.formulateInputMatrix(3);
        System.out.println(obj.solve(input, 6));
    }

    /*[
  [1, 3, 5, 7]
  [2, 4, 6, 8]
]*/
}
