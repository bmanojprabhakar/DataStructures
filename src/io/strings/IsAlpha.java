package io.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class IsAlpha {
    public int solve(ArrayList<Character> A) {
        for(char a: A) {
            if(!Character.isLetter(a) && !Character.isDigit(a)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        IsAlpha obj = new IsAlpha();
        Character[] arr = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', '3', 'c', 'e', 'm', 'y'};
        ArrayList<Character>  list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        System.out.println(obj.solve(list));
    }
}
