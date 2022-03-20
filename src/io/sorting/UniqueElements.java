package io.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int result = 0, obtained = 0;

        for (int i = 1; i < A.size(); ++i) {
            if (A.get(i-1)==A.get(i)) {
                obtained ++;
                result -= A.get(i);
            } else {
                int lend = Math.min(obtained, A.get(i)-A.get(i-1)-1);
                result += lend * (lend+1)/2 + lend * (A.get(i-1));
                obtained -= lend;
            }
        }

        if(A.size()>0)
            result += obtained * (obtained+1)/2 + obtained*(A.get(A.size()-1));

        return result;
    }
    public static void main(String[] args) {
        UniqueElements obj = new UniqueElements();
        System.out.println(obj.solve(new ArrayList<>(Arrays.asList(1,1,2,2,3))));
    }
}
