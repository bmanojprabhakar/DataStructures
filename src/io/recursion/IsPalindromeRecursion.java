package io.recursion;

public class IsPalindromeRecursion {
    public int solve(String A) {
        if(A.length() == 0)
            return 1;

        if(isPalindrome(A, 0, A.length() - 1))
            return 1;
        return 0;
    }

    private boolean isPalindrome(String input, int startIndex, int lastIndex) {
        if(startIndex == lastIndex)
            return true;

        if(input.charAt(startIndex) != input.charAt(lastIndex))
            return false;

        if(startIndex < lastIndex)
            return isPalindrome(input, startIndex+1, lastIndex-1);
        return true;
    }

    public static void main(String[] args) {
        IsPalindromeRecursion obj = new IsPalindromeRecursion();
        System.out.println(obj.solve("strings"));
    }
}
