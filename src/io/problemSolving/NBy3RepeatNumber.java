package io.problemSolving;

import java.util.Arrays;
import java.util.List;

public class NBy3RepeatNumber {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        int firstCount = 0;
        int secondCount = 0;

        int firstNum = Integer.MIN_VALUE;
        int secondNum = Integer.MIN_VALUE;

        for(int i=0;i<a.size();i++) {
            if(a.get(i)==firstNum)
                firstCount++;
            else if(a.get(i) == secondNum)
                secondCount++;
            else if(firstCount == 0) {
                firstNum = a.get(i);
                firstCount++;
            } else if(secondCount == 0) {
                secondNum = a.get(i);
                secondCount++;
            } else {
                firstCount--;
                secondCount--;
            }
        }

        firstCount = 0;
        secondCount = 0;

        for(int i=0;i<a.size();i++) {
            if(a.get(i)==firstNum)
                firstCount++;
            if(a.get(i) == secondNum)
                secondCount++;
        }

        if(firstCount > a.size()/3)
            return firstNum;
        if(secondCount > a.size()/3)
            return secondNum;
        return -1;
    }
    public static void main(String[] args) {
        NBy3RepeatNumber obj = new NBy3RepeatNumber();
        Integer[] arr = {1, 2, 3, 4, 5, 4, 4, 4, 4};
        System.out.println(obj.repeatedNumber(Arrays.asList(arr)));
    }
}
