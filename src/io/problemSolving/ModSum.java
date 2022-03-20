package io.problemSolving;

import java.util.Arrays;

public class ModSum {
    public int solve(int[] A) {
        int[] count = new int[1001];
        long mod = 1000000007;
        Arrays.fill(count, 0);
        long result = 0;
        for(int a: A)
            count[a]++;

        for(int i=1;i<=1000;i++) {
            for(int j=1;j<=1000;j++) {
                int val = i%j;
                int temp = count[i]*count[j]*val;
                result = ((result%mod)+(temp%mod))%mod;
            }
        }
        return (int) result;
    }

    public static void main(String[] args) {
        ModSum obj = new ModSum();
        int[] arr = new int[]{1, 2, 3};
        System.out.println(obj.solve(arr));
    }
}
