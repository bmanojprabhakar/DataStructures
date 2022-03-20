package io.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Map<Integer,Integer> arrayMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<A.size();i++) {
            if(arrayMap.containsKey(A.get(i)))
                arrayMap.put(A.get(i), arrayMap.get(A.get(i))+1);
            else
                arrayMap.put(A.get(i), 1);
        }

        for(int i=0;i<B.size();i++) {
            if(arrayMap.containsKey(B.get(i)) &&
                    arrayMap.get(B.get(i)) > 0) {
                result.add(B.get(i));
                arrayMap.put(B.get(i), arrayMap.get(B.get(i))-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CommonElements obj = new CommonElements();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        Integer[] firstArr = {1, 1};
        Integer[] secondArr = {1};

        first.addAll(Arrays.asList(firstArr));
        second.addAll(Arrays.asList(secondArr));

        System.out.println(obj.solve(first, second));
    }
}
