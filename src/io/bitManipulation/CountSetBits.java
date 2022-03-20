package io.bitManipulation;

public class CountSetBits {
    public int solve(int A) {
        int bitCount = 0;

        for(int i=1; i<=A; i++) {
            bitCount += countOfBits(Integer.toBinaryString(i));
        }
        return (int) ((bitCount)%((Math.pow(10,9)) + 7));
    }

    public int solve2(int A) {
        int bitCount = 0;

        for(int i=1; i<=A; i++) {
            bitCount += countOfBitsUtil(i);
        }
        return (int) ((bitCount)%((Math.pow(10,9)) + 7));
    }

    private int countOfBitsUtil(int i) {
        if(i<=0)
            return 0;
        return (i%2==0 ? 0:1)+countOfBitsUtil(i/2);
    }

    private int countOfBits(String toBinaryString) {
        int bitCount = 0;
        for(char s: toBinaryString.toCharArray()) {
            if ((int) s % 2 != 0) {
                bitCount++;
            }
        }
        return bitCount;
    }

    // Function which counts set bits from 0 to n
    int countSetBits(int n) {
        int i = 0;

        // ans store sum of set bits from 0 to n
        int bitCount = 0;

        // while n greater than equal to 2^i
        while ((1 << i) <= n) {

            // This k will get flipped after
            // 2^i iterations
            boolean flag = false;

            // shiftBit is iterator from 2^i to 1
            int shiftBit = 1 << i;

            // This will loop from 0 to n for
            // every bit position
            for (int j = 0; j <= n; j++) {

                if (flag == true)
                    bitCount += 1;
                else
                    bitCount += 0;

                if (shiftBit == 1) {

                    // When shiftBit = 1 flip the bit
                    flag = !flag;

                    // again set shiftBit to 2^i
                    shiftBit = 1 << i;
                } else {
                    shiftBit--;
                }
            }

            // increment the position
            i++;
        }
        return bitCount;
    }

    public static void main(String[] args) {
        CountSetBits obj = new CountSetBits();
//        System.out.println(obj.solve(3));
//        System.out.println(obj.solve2(5));
        System.out.println(obj.countSetBits(4));
    }
}
