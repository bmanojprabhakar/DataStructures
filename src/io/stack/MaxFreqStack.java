package io.stack;

import java.util.*;

public class MaxFreqStack {
    private Map<Integer,Integer> frequency = new HashMap<>();
    private Map<Integer, Stack<Integer>> maxMap = new HashMap<>();
    private int maxFreq;

    public int[] solve(int[][] A) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<A.length;i++) {
            if(A[i][0]==1) {
                result.add(-1);
                push(A[i][1]);
            } else {
                result.add(pop());
            }
        }
        return  result.stream().mapToInt(i->i).toArray();
    }

    private void push(int x) {
        int freq = frequency.getOrDefault(x, 0)+1;
        frequency.put(x, freq);

        if(freq>maxFreq)
            maxFreq = freq;

        maxMap.computeIfAbsent(freq, s -> new Stack<>()).push(x);
    }

    private int pop() {
        int top = maxMap.get(maxFreq).pop();
        frequency.put(top, frequency.get(top) - 1);

        if(maxMap.get(maxFreq).size() == 0)
            maxFreq--;
        return top;
    }

    public static void main(String[] args) {
        MaxFreqStack obj = new MaxFreqStack();
        int[][] arr = new int[][]{{1, 5},
                {1, 7},
                {1, 5},
                {1, 7},
                {1, 4},
                {1, 5},
                {2, 0},
                {2, 0},
                {2, 0},
                {2, 0}};
        int[] result = obj.solve(arr);

        for(int i:result)
            System.out.println(i);
    }
}
