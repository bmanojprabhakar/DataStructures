package io.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class ToLower {
    public ArrayList<Character> to_lower(ArrayList<Character> A) {
        ArrayList<Character>  ret = new ArrayList<>();
        for(char a: A) {
            ret.add(Character.toLowerCase(a));
        }
        return ret;
    }

    public static void main(String[] args) {
        ToLower obj = new ToLower();
        Character[] arr = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
        ArrayList<Character>  list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        System.out.println(obj.to_lower(list));
    }
}
