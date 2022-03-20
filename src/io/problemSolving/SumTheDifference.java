package io.problemSolving;

import java.util.Arrays;

public class SumTheDifference {
    public int solve(int[] A) {
        long result = 0;
        Arrays.sort(A);
        int mod = 1000000007;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                result += ((A[j]-A[i])%mod)*((Math.pow(2,j-i-1))%mod);
                result %= mod;
            }
        }
        return (((int) result) % mod);
    }

    static long power(int x, int y) {
        long pow = 1;
        for (int i = 1; i <= y; i++)
            pow *= x;
        return pow;
    }

    public static void main(String[] args) {
        SumTheDifference obj = new SumTheDifference();
        int[] arr = new int[]{1,2,3,5,7};
        System.out.println(obj.solve(arr));
//        long power1 = (long) Math.pow(2,63);
//        long power2 = (long) Math.pow(2,10);
//        System.out.println(power1*power2);
    }
}
