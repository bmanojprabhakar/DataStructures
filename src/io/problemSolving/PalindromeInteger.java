package io.problemSolving;

public class PalindromeInteger {
    public int isPalindrome(int A) {
        int temp = A;
        int total = 0,remainder;

        while(A > 0) {
            remainder = A%10;
            total = (total*10)+remainder;
            A = A/10;
        }

        if(temp==total)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        PalindromeInteger obj = new PalindromeInteger();
        System.out.println(obj.isPalindrome(1234321));
    }
}
