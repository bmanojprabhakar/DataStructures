package io.problemSolving;

public class DivisorGame {
    public int solve(int A, int B, int C) {
        int gcd = findGcd(B, C);
        int lcm = (B*C)/gcd;

        return A/lcm;
    }

    private int findGcd(int b, int c) {
        if(c == 0)
            return b;
        return findGcd(c, b%c);
    }

    public static void main(String[] args) {
        DivisorGame obj = new DivisorGame();
        System.out.println(obj.solve(12,3,2));
    }
}
