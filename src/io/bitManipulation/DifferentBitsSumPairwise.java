package io.bitManipulation;

public class DifferentBitsSumPairwise {
    public int cntBits(int[] A) {
        long result = 0;
        long mod = 1000000007L;
        for(int i=0;i<32;i++) {
            long count = 0;
            for(int j=0;j<A.length;j++) {
                if((A[j] & (1<<i)) != 0)
                    count++;
            }
            result += (count * (A.length-count) * 2);
            result %= mod;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        DifferentBitsSumPairwise obj = new DifferentBitsSumPairwise();
        int[] arr = new int[]{2,3};
        System.out.println(obj.cntBits(arr));
    }
}
