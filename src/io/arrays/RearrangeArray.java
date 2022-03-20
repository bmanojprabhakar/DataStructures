package io.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
    public void arrange(ArrayList<Integer> a) {
        int n = a.size();
        for(int i=0;i<n; i++)
            a.set(i, a.get(i)+(((a.get(a.get(i)))%n)*n));

        System.out.print(a);

        for(int i=0;i<n;i++) {
            a.set(i, a.get(i) / n);
            System.out.print(a.get(i));
        }
    }

    public static void main(String[] args) {
        RearrangeArray obj = new RearrangeArray();
        Integer[] arr = {4, 0, 2, 1, 3};
        ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(arr));
        obj.arrange(ls);
    }
}
