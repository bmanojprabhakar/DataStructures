package io.recursion;

public class SumOfDigits {
    public int solve(int A) {
        String str = String.valueOf(A);
        char[] strArray = str.toCharArray();
        int total = 0;

        for(char c: strArray) {
            total += Integer.parseInt(String.valueOf(c));
        }
        return total;
    }

    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();
        System.out.println(obj.solve(46));
    }
}
