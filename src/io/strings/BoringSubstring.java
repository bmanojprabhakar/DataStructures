package io.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoringSubstring {
    public int solve(String A) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        A = Stream.of(A.split("")).sorted()
                .collect(Collectors.joining());

        for(int i=0;i<A.length();i++) {
            int ascii = (int) A.charAt(i);
            System.out.println(ascii);
            if(ascii%2==0)
                even.append(A.charAt(i));
            else
                odd.append(A.charAt(i));
        }

        if(Math.abs(odd.charAt(odd.length()-1) - even.charAt(0)) > 1 ||
                Math.abs(even.charAt(even.length()-1) - odd.charAt(0)) > 1)
            return  1;

        return 0;
    }
    public static void main(String[] args) {
        BoringSubstring obj = new BoringSubstring();
        System.out.println(obj.solve("wwuvuw"));
        /*
        w u u
        w v w
         */
    }
}
