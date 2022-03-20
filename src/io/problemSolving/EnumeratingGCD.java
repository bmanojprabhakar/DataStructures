package io.problemSolving;

public class EnumeratingGCD {
    public String solve(String A, String B) {
        if(A.equals(B))
            return A;
        else
            return "1";
    }

    public static void main(String[] args) {
        EnumeratingGCD obj = new EnumeratingGCD();
        System.out.println(obj.solve("1", "3"));
    }
}
