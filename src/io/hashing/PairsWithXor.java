package io.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairsWithXor {
    public int solve(ArrayList<Integer> A, int B) {
        Map<Integer, Integer> visitedNode = new HashMap<>();
        int pair = 0;

        for (int i : A) {
            int xorValue = B ^ i;
            if (visitedNode.containsKey(xorValue) &&
                    !visitedNode.containsKey(i)) {
                pair++;
            }
            visitedNode.putIfAbsent(i, 1);
        }
        return pair;
    }

    public static void main(String[] args) {
        PairsWithXor obj = new PairsWithXor();
        Integer[] arr = {5, 4, 10, 15, 7, 6, 10, 15, 15, 10};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(obj.solve(list, 5));
    }
}
