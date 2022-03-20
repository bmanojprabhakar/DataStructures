package io.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringManipulation {
    public String longestCommonPrefix(ArrayList<String> A) {
        Collections.sort(A);

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<A.get(0).length();i++) {
            if(A.get(0).charAt(i) == A.get(A.size()-1).charAt(i))
                sb.append(A.get(0).charAt(i));
            else
                break;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        StringManipulation obj = new StringManipulation();
        String[] arr = {"aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        System.out.println(obj.longestCommonPrefix(list));
    }
}
