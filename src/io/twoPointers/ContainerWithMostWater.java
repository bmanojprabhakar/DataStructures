package io.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWithMostWater {
    public int maxArea(ArrayList<Integer> A) {
        int result = 0;
        int pointer1 = 0;
        int pointer2 = A.size()-1;

        while(pointer1 < pointer2) {
            result = Math.max(result, (pointer2 - pointer1) * Math.min(A.get(pointer2), A.get(pointer1)));
            if(A.get(pointer1) < A.get(pointer2))
                pointer1++;
            else
                pointer2--;
        }
        return result;
    }
    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,5,4,3));
        System.out.println(obj.maxArea(al));
    }
}
