package io.sorting;

import java.util.*;

public class LargestNumber {

    public String largestNumber(final List<Integer> A) {
        StringBuilder sbr = new StringBuilder();
        List<String> strArr = new ArrayList<>();
        int isAllZero = 0;
        for(int i: A) {
            strArr.add(String.valueOf(i));
        }

        Collections.sort(strArr, new Comparator<String>() {
            public int compare(String firstValue, String secondValue) {
                String initial = firstValue + secondValue;
                String fin = secondValue + firstValue;

                return initial.compareTo(fin) > 0 ? -1 : 1;
            }
        });

        for(int i=0; i<strArr.size(); i++) {
            if(Integer.parseInt(strArr.get(i)) != 0)
                isAllZero++;
            sbr.append(strArr.get(i));

            if(i==strArr.size()-1 && isAllZero==0) {
                sbr.setLength(0);
                sbr = new StringBuilder();
                sbr.append("0");
            }
        }

        String largestValue = sbr.toString();
        return largestValue;
    }

    public static void main(String[] args) {
        LargestNumber obj = new LargestNumber();
//        Integer[] arr = {3, 30, 34, 5, 9};
        Integer[] arr = {0,0,0,0};

        //9534503

        System.out.println(obj.largestNumber(Arrays.asList(arr)));
    }
}
