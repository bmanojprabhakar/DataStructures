package io.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class CountRectangles {
    public int solve(ArrayList<Integer> A, int B) {
        long result = 0;
        int start = 0;
        int end = A.size()-1;

        while(start <= end) {
            long mul = (long) A.get(start) * A.get(end);
            if(mul < B) {
                result = (result + 2L *(end-start) + 1)%(1000000007);
                start++;
            } else {
                end--;
            }
        }

        return (int)result;
    }
    public static void main(String[] args) {
        CountRectangles obj = new CountRectangles();
        ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(1,2));
        System.out.println(obj.solve(ls, 5));
    }
}
