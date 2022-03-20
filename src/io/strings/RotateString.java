package io.strings;

public class RotateString {
    public String solve(String A, int B) {
        if(B > A.length())
            B = B%A.length();
        int distance = A.length()-B;
        return A.substring(distance)+A.substring(0,distance);
    }

    public static void main(String[] args) {
        RotateString obj = new RotateString();
        String name = "bue";
        System.out.println(name.length());
        int rotation = 78;
        System.out.println(obj.solve(name, rotation));
    }
}
