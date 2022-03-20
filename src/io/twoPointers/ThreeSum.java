package io.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSum {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int pointer1, pointer2 = 0;
        long closestValue = Integer.MAX_VALUE;

        for(int i=0;i<A.size()-2;i++) {
            pointer1 = i+1;
            pointer2 = A.size()-1;

            while(pointer1 < pointer2) {
                int sum = A.get(i)+A.get(pointer1)+A.get(pointer2);
                int diff = Math.abs(sum - B);

                if(diff == 0)
                    return B;

                if(diff < Math.abs(closestValue - B))
                    closestValue = sum;

                if(sum < B)
                    pointer1++;
                else
                    pointer2--;
            }
        }
        return (int) closestValue;
    }
    public static void main(String[] args) {
        ThreeSum obj = new ThreeSum();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2, 1, -9, -7, -8, 2, -8, 2, 3, -8 ));
        // -1, 2, 1, -4
        System.out.println(obj.threeSumClosest(al, -1));
    }
}
