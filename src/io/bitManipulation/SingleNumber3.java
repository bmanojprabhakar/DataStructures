package io.bitManipulation;

public class SingleNumber3 {
    public int[] solve(int[] A) {
        int xor = 0;

        for(int i=0;i<A.length;i++) {
            xor = xor ^ A[i];
        }
        int mask = (xor)&(-xor);
        int xorA = 0;
        int xorB = 0;

        for(int num: A) {
            if((num&mask) == 0)
                xorA^=num;
            else
                xorB^=num;
        }
        return new int[]{Math.min(xorA,xorB), Math.max(xorA, xorB)};
    }

    public static void main(String[] args) {
        SingleNumber3 obj = new SingleNumber3();
        int[] arr = new int[]{1, 2};
        int[] result = obj.solve(arr);

        for(int i: result)
            System.out.println(i);
    }
}
