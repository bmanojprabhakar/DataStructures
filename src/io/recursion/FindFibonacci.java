package io.recursion;

import java.util.ArrayList;
import java.util.List;

public class FindFibonacci {
    public int findAthFibonacci(int A) {
        List<Integer> fibonacciSeries;
        fibonacciSeries = buildFibonacciSeries(A);

        if(A==0 || A==1)
            return A;
        else
            return fibonacciSeries.get(A-1)+fibonacciSeries.get(A-2);
    }

    private List<Integer> buildFibonacciSeries(int a) {
        List<Integer> fibonacciSeries = new ArrayList<>();

        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        for(int i=0;i<a;i++) {
            if(i==0)
                fibonacciSeries.add(i);
            else if(i==1)
                fibonacciSeries.add(i);
            else {
                fibonacciSeries.add(fibonacciSeries.get(i-1) +
                        fibonacciSeries.get(i-2));
            }
        }
        return fibonacciSeries;
    }

    public static void main(String[] args) {
        FindFibonacci obj = new FindFibonacci();
        System.out.println(obj.findAthFibonacci(9));
    }
}
