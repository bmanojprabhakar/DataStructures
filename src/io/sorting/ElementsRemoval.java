package io.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ElementsRemoval {
    public int solve(ArrayList<Integer> A) {
        int result = 0;
        Collections.sort(A);
        int sum = A.stream().mapToInt(i -> i.intValue()).sum();

        for(int i=A.size()-1;i>=0;i--) {
            int temp = sum-A.get(i);
            result = result+temp;
            if(i==A.size()-1)
                result +=sum;
            sum = temp;
        }

        return result;
    }
    public static void main(String[] args) {
        ElementsRemoval obj = new ElementsRemoval();
        System.out.println(obj.solve(new ArrayList<>(Arrays.asList(8,0,10))));
    }
}
