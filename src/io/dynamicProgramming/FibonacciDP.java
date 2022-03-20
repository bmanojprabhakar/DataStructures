package io.dynamicProgramming;

import java.util.Scanner;

public class FibonacciDP {
    public static int printFibSeries(int n) {
        int[] f = new int[n+2];
        f[0] = 0;
        f[1] = 1;

        for(int i=2;i<=n;i++)
            f[i] = f[i-1]+f[i-2];

        return  f[n];
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            if(scanner.hasNextInt())
                System.out.println(FibonacciDP.printFibSeries(scanner.nextInt()));
        }


    }
}
