package io.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpiralMatrix2 {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        return manipulateSpiralMatrix(A);
    }

    private ArrayList<ArrayList<Integer>> manipulateSpiralMatrix(int a) {
        Integer spiralMatrix[][] = new Integer[a][a];
        int elements = 1;

        int rowStartIndex = 0;
        int columnStartIndex = 0;
        int rowEndIndex = spiralMatrix.length;
        int colEndIndex = spiralMatrix.length;

        while((rowStartIndex<rowEndIndex) && (columnStartIndex < colEndIndex)) {
            for (int i = columnStartIndex; i < colEndIndex; i++) {
                spiralMatrix[rowStartIndex][i] = elements++;
            }
            rowStartIndex++;

            for (int i = rowStartIndex; i < rowEndIndex; i++) {
                spiralMatrix[i][colEndIndex-1] = elements++;
            }
            colEndIndex--;

            if(rowStartIndex < rowEndIndex) {
                for (int i = colEndIndex - 1; i >= columnStartIndex; i--) {
                    spiralMatrix[rowEndIndex-1][i] = elements++;
                }
                rowEndIndex--;
            }

            if(columnStartIndex < colEndIndex) {
                for (int i = rowEndIndex - 1; i >= rowStartIndex; i--) {
                    spiralMatrix[i][columnStartIndex] = elements++;
                }
                columnStartIndex++;
            }
        }

        return printMatrix(spiralMatrix);
    }

    private ArrayList<ArrayList<Integer>> printMatrix(Integer[][] m) {
        List<List<Integer>> ls = Arrays.stream(m).map(Arrays::asList).collect(Collectors.toList());
        ArrayList<ArrayList<Integer>> resultant = new ArrayList();

        for(List<Integer> l: ls) {
            ArrayList<Integer> innerList = new ArrayList();
            innerList.addAll(l);
            resultant.add(innerList);
        }

        return resultant;
    }

    public static void main(String[] args) {
        SpiralMatrix2 obj = new SpiralMatrix2();
        System.out.println(obj.generateMatrix(4));
    }
}
