package io.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AntiDiagonals {

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> diagonalMatrix;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> resultant = new ArrayList<>();

        for(int i=0;i<A.size();i++) {
            for(int j=0;j<A.get(i).size();j++) {
                if(map.containsKey(i+j)) {
                    diagonalMatrix = map.get(i+j);
                } else {
                    diagonalMatrix = new ArrayList<>();
                }
                diagonalMatrix.add(A.get(i).get(j));
                map.put((i+j), diagonalMatrix);
            }
        }

        for(int key: map.keySet()) {
            resultant.add(map.get(key));
        }

        for(ArrayList<Integer> list: resultant) {
            int n = list.size();
            for(int i=n;i<A.get(0).size();i++) {
                list.add(0);
            }
        }
        return resultant;
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
        AntiDiagonals obj = new AntiDiagonals();
        ArrayList<ArrayList<Integer>> inputMatrix = obj.formulateInputMatrix(3);
        System.out.println(obj.diagonal(inputMatrix));
    }
}
