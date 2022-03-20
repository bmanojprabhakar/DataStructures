package io.bitManipulation;

public class ReverseBits {
    public long reverse(long a) {
        StringBuilder bits = new StringBuilder(Long.toBinaryString(a));
        StringBuilder appendZeros = new StringBuilder();

        for(int i=0;i<(32-bits.length());i++) {
            appendZeros.append('0');
        }
        bits.insert(0, appendZeros);

        return Long.parseLong(bits.reverse().toString(), 2);
    }

    public static void main(String[] args) {
        ReverseBits obj = new ReverseBits();
        System.out.println(obj.reverse(3));
    }
}
