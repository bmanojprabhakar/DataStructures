package io.hashing;

import java.util.*;

public class Anagrams {
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        Map<String, ArrayList<Integer>> visitedElements = new HashMap<>();

        for(int i=0;i<A.size();i++) {
            String sortedString = fetchSortedString(A.get(i));
            visitedElements.computeIfAbsent(sortedString, list -> new ArrayList<>()).add(i+1);
        }

        return new ArrayList<>(visitedElements.values());
    }

    private String fetchSortedString(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        Anagrams obj = new Anagrams();
        String[] str = {"rat", "tar", "art"};
        System.out.println(obj.anagrams(Arrays.asList(str)));
    }
}
