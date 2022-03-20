package io.hashing;

import java.util.HashSet;

public class ColorfulNumbers {
    public int colorful(int A) {
        String number = String.valueOf(A);
        HashSet<Integer> checkSet = new HashSet<>();

        for(int i=0;i<number.length();i++) {
            int product = 1;
            for(int j=i; j<number.length(); j++) {
                int value = Character.getNumericValue(number.charAt(j));
                product *= value;
                if(checkSet.contains(product))
                    return 0;
                checkSet.add(product);
            }
        }

        return 1;
    }
    public static void main(String[] args) {
        ColorfulNumbers obj = new ColorfulNumbers();
        System.out.println(obj.colorful(3245));
    }
}
