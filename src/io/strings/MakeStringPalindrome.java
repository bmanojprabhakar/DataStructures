package io.strings;

public class MakeStringPalindrome {
    int result = 0;
    public int solve(String A) {
        for(int i=0;i<A.length();i++) {
            if(isPalindrome(A.substring(0,A.length()-i)))
                break;
            else
                result++;
        }
        return result;
    }

    public boolean isPalindrome(String s) {
        StringBuilder input = new StringBuilder(s);
        if(s.equals(input.reverse().toString()))
            return true;
        return false;
    }

    public static void main(String[] args) {
        MakeStringPalindrome obj = new MakeStringPalindrome();
        System.out.println(obj.solve("mayamm"));
    }
}
