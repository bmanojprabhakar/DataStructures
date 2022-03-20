package io.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SortMinUnsorted {
    public int solve(ArrayList<Integer> A) {
        int result = 0;
        int start = 0;
        int end = 0, max, min, i;

        for (start=0;start<A.size()-1;start++) {
            if (A.get(start) > A.get(start + 1))
                break;
        }

        if(start==A.size()-1)
            return 0;

        for(end=A.size()-1;end>0;end--) {
            if(A.get(end) < A.get(end-1))
                break;
        }

        max = A.get(start);
        min = A.get(start);

        for(i=start;i<=end+1;i++) {
            if(A.get(i)>max)
                max = A.get(i);
            if(A.get(i)<min)
                min = A.get(i);
        }

        for(i=0;i<start;i++) {
            if(A.get(i) > min) {
                start = i;
                break;
            }
        }

        for(i=A.size()-1;i>=end+1;i--) {
            if(A.get(i) < max) {
                end = i;
                break;
            }
        }

        result = (end - start)+1;

        return result;
    }

    public static void main(String[] args) {
        SortMinUnsorted obj = new SortMinUnsorted();
        System.out.println(obj.solve(new ArrayList<>(Arrays.asList(-999967396, -999888735, -999861273, -999347918, -998726759, -997399414, -859648220, -743113463, 692192828, 698431747, 985409072, 993282433, 997431107, 998481001, 999017658, 999886311, 999981981, 999990154, 999992820, 999995412, 999996444, 999998876, 999999929, 999999937, 999999958, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000))));
    }
}
