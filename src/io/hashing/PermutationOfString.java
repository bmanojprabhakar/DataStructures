package io.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationOfString {
    public int solve1(String A, String B) {
        int result = 0;
        String compareString = sortString(A);
        char[] arr = B.toCharArray();
        int i=0;
        int len = A.length();

        while(i < B.length() - (len-1)) {
            String s = sortString(B.substring(i,i+A.length()));
            if(s.equals(compareString))
                result++;
            i++;
        }

        return result;
    }

    public int solve(String A, String B) {
        int result = 0;
        Map<Character, Integer> compareMap = new HashMap<>();

        for(char c: A.toCharArray())
            compareMap.put(c, 1);

        int i=0;
        int len = A.length();

        while(i < B.length() - (len-1)) {
            String s = B.substring(i,i+A.length());
            boolean isEqual = false;

            for(char c: s.toCharArray()) {
                if(!compareMap.containsKey(c)) {
                    isEqual = false;
                    break;
                }
                isEqual = true;
            }

            if(isEqual)
                result++;
            i++;
        }

        return result;
    }

    private String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String str = new String(arr);
        return str;
    }

    public static void main(String[] args) {
        PermutationOfString obj = new PermutationOfString();
        System.out.println(obj.solve("abc", "abcbacabc"));
    }
}
