package io.problemSolving;

public class PairSumDivisibleByM {
    public int solve(int[] A, int B) {
        int[] count = new int[B];
        long mod = 1000000007;

        for(int i=0;i<A.length;i++)
            ++count[A[i]%B];

        int sum = count[0]*(count[0]-1)/2;
        sum %= mod;

        for(int i=1;i<=B/2 && i!=(B-i);i++) {
            sum += count[i] * count[B - i];
            sum %= mod;
        }

        if(B%2==0) {
            sum += (count[B / 2] * (count[B / 2] - 1) / 2);
            sum %= mod;
        }

        return sum;
    }

    public static void main(String[] args) {
        PairSumDivisibleByM obj = new PairSumDivisibleByM();
        int[] arr = new int[]{93, 9, 46, 79, 56, 24, 10, 26, 9, 93, 31, 93, 75, 7, 4, 80, 19, 67, 49, 84, 62, 100, 17, 40, 35, 84, 14, 81, 99, 31, 100, 66, 70, 2, 11, 84, 60, 89, 13, 57, 47, 60, 59, 60, 42, 67, 89, 29, 85, 83, 42, 47, 66, 80, 88, 85, 83, 82, 16, 23, 21, 55, 26, 2, 21, 92, 85, 26, 46, 3, 7, 95, 50, 22, 84, 52, 57, 44, 4, 23, 25, 55, 41, 49};
        System.out.println(obj.solve(arr, 37));
    }
}
