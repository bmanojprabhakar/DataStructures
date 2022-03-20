package io.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PerfectCards {
    public String solve(ArrayList<Integer> A) {
        Map<Integer, Integer> storeCards = new HashMap<>();

        for(int i=0;i<A.size();i++) {
            if(storeCards.containsKey(A.get(i)))
                storeCards.put(A.get(i), storeCards.get(A.get(i))+1);
            storeCards.putIfAbsent(A.get(i), 1);
        }

        if(storeCards.size() > 1) {
            Object firstCard = storeCards.keySet().toArray()[0];
            Object secondCard = storeCards.keySet().toArray()[1];

            if (storeCards.size() == 2 && (storeCards.get(firstCard) == storeCards.get(secondCard)))
                return "WIN";
        }
        return "LOSE";
    }

    public static void main(String[] args) {
        PerfectCards obj = new PerfectCards();
        Integer[] arr = {1, 2};
        System.out.println(obj.solve(new ArrayList<>(Arrays.asList(arr))));
    }
}
