package io.problemSolving;

public class ReverseInteger {
    public int reverse(int A) {
        int temp = 0;
        int rev = 0;
        int prev = 0;

        while(A!=0) {
            temp = A%10;
            rev = rev*10+temp;

            if((rev - temp)/10 != prev)
                return 0;
            prev = rev;
            A = A/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        System.out.println(obj.reverse(-1146467285));
    }
}
