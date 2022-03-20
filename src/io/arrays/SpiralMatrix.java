package io.arrays;

import java.util.ArrayList;

public class SpiralMatrix {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> inputMatrix;
        inputMatrix = formulateInputMatrix(A);
        return manipulateSpiralMatrix(inputMatrix, A);
    }

    private ArrayList<ArrayList<Integer>> manipulateSpiralMatrix(ArrayList<ArrayList<Integer>> inputMatrix, int a) {
        ArrayList<ArrayList<Integer>> resultantMatrix = new ArrayList<>();
        ArrayList<Integer> resultantNumbers = new ArrayList<>();

        int rowStartIndex = 0;
        int columnStartIndex = 0;
        int rowEndIndex = inputMatrix.size();
        int colEndIndex = inputMatrix.get(0).size();

        while((rowStartIndex<rowEndIndex) && (columnStartIndex < colEndIndex)) {
            for (int i = columnStartIndex; i < colEndIndex; i++) {
                resultantNumbers.add(inputMatrix.get(rowStartIndex).get(i));
            }
            rowStartIndex++;

            for (int i = rowStartIndex; i < rowEndIndex; i++) {
                resultantNumbers.add(inputMatrix.get(i).get(colEndIndex - 1));
            }
            colEndIndex--;

            if(rowStartIndex < rowEndIndex) {
                for (int i = colEndIndex - 1; i >= columnStartIndex; i--) {
                    resultantNumbers.add(inputMatrix.get(rowEndIndex - 1).get(i));
                }
                rowEndIndex--;
            }

            if(columnStartIndex < colEndIndex) {
                for (int i = rowEndIndex - 1; i >= rowStartIndex; i--) {
                    resultantNumbers.add(inputMatrix.get(i).get(columnStartIndex));
                }
                columnStartIndex++;
            }
        }

        System.out.println("Spiral numbers: "+resultantNumbers);

        resultantMatrix = formSpiralMatrix(resultantNumbers, a);

        return resultantMatrix;
    }

    private ArrayList<ArrayList<Integer>> formSpiralMatrix(ArrayList<Integer> resultantNumbers, int splitIndex) {
        int startIndex = 0;
        int endIndex = splitIndex;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i=startIndex; i<splitIndex; i++) {
            ArrayList<Integer> equalChunks = new ArrayList<>();
            equalChunks.addAll(resultantNumbers.subList(startIndex, endIndex));
            startIndex += splitIndex;
            endIndex += splitIndex;
            result.add(equalChunks);
        }
        return result;
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
        SpiralMatrix obj = new SpiralMatrix();
        obj.generateMatrix(4);
    }
}
