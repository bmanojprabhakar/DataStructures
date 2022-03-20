package io.problemSolving;

import java.util.Scanner;

public class RotationGame {
    public static String solve(String A, int B) {
        if(B > A.length())
            B = B%A.length();
        int distance = A.length()-B;
        return A.substring(distance)+A.substring(0,distance);
    }

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        String input = "";
        int rotationNum = 0;

        Scanner scn = new Scanner(System.in);
        if (scn.hasNextLine())
            input = scn.nextLine();
        if(scn.hasNextLine())
            rotationNum = Integer.parseInt(scn.nextLine());

        String s = input.substring(1);

        if(rotationNum > s.length())
            rotationNum = rotationNum%s.length();
        int distance = s.length()-rotationNum;
        System.out.println(s.substring(distance)+s.substring(0,distance));
    }
    /*int size = input.charAt(0) - '0';
    int[] arr = new int[size];

        for(int i=1;i<input.length();i++)
    arr[i-1] = input.charAt(i) - '0';*/
}
