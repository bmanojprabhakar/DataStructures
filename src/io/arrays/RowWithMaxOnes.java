package io.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RowWithMaxOnes {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int count = 0;
        int rowNum = 0;

        for(int a=0;a<A.size();a++) {
            int internalCount = 0;

            ArrayList<Integer> al = A.get(a);

            for(int i=0;i<al.size();i++) {
                if(al.get(i)==1) {
                    internalCount++;
                }
                if(i==al.size()-1) {
                    if(internalCount > count) {
                        count = internalCount;
                        rowNum = a;
                    }
                }
            }
        }
        return rowNum;
    }

    public static void main(String[] args) {
        RowWithMaxOnes obj = new RowWithMaxOnes();
        ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        Integer[] arr1 = {0,0,0,0};
        Integer[] arr2 = {0,1,1,1};
        Integer[] arr3 = {0,1,1,1};
        list1.addAll(Arrays.asList(arr1));
        list2.addAll(Arrays.asList(arr2));
        list3.addAll(Arrays.asList(arr3));

//        Integer[][] arr = {{0,0,0,0}, {0,1,1,1}};
//        List<Integer> collection = Arrays.stream(arr).flatMap(Arrays::stream)
//                .collect(Collectors.toList());
//        list.addAll(collection);
        outerList.add(list1);
        outerList.add(list2);
        outerList.add(list3);
        System.out.println(obj.solve(outerList));
    }
}
