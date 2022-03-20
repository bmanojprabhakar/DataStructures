package io.bitManipulation;

import java.util.Arrays;
import java.util.List;

public class SingleNumber {
    public int singleNumber(final List<Integer> A) {
        int xor = A.get(0);

        for(int i=1;i<A.size();i++) {
            xor = xor ^ A.get(i);
        }

        return xor;
    }

    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
        System.out.println(obj.singleNumber(Arrays.asList(1, 2, 2)));
    }
}
