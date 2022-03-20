package io.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumPicks {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        boolean isOddIdentified = false;
        int minOddNum = 0;
        int maxEvenNum = 0;

        for(int a: A) {
            if(a % 2 != 0 && !isOddIdentified) {
                minOddNum = a;
                isOddIdentified = true;
            } else if(a%2==0) {
                maxEvenNum = a;
            }
        }

        return maxEvenNum - minOddNum;
    }

    public static void main(String[] args) {
        MinimumPicks obj = new MinimumPicks();
        Integer[] inputArr = {5, 17, 100, 1};
        ArrayList<Integer> listOfNums = new ArrayList<>();
        listOfNums.addAll(Arrays.asList(inputArr));
        System.out.println(obj.solve(listOfNums));
    }
}
