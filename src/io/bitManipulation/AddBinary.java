package io.bitManipulation;

import java.math.BigInteger;

public class AddBinary {
    public static String addBinary(String A, String B) {
        BigInteger a = new BigInteger(A, 2);
        BigInteger b = new BigInteger(B, 2);
        BigInteger c;
        c = a.add(b);
        return c.toString(2);
    }

    public static void main(String[] args) {
        AddBinary obj = new AddBinary();
        System.out.println(obj.addBinary("10001100010111000101100010100110001001101010000010011010","101111000100100100111110010010101110101001100100101001111010011000000110"));
    }
}
