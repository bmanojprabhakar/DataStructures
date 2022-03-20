package io.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSeq {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestConsecutive(final List<Integer> A) {
        int result = 0;
        Set<Integer> storeValues = new HashSet<>(A);

        for(int i=0;i<A.size();i++) {
            if(!storeValues.contains(A.get(i) - 1)) {
                int nextElement = A.get(i)+1;

                while(storeValues.contains(nextElement))
                    nextElement++;

                if(result < nextElement-A.get(i))
                    result = nextElement-A.get(i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        LongestConsecutiveSeq obj = new LongestConsecutiveSeq();
        System.out.println(obj.longestConsecutive(Arrays.asList(1, 9, 3, 10, 4, 20, 2)));
    }
}
