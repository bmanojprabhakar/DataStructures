package io.problemSolving;

public class TrailingZerosFactorial {
    public int trailingZeroes1(int A) {
        int count = 0;
        long fact = 1;

        for(int i=A;i>0;i--) {
            fact *= i;
        }

        System.out.println(fact);

        while(fact > 0) {
            if(fact%10 == 0)
                count++;
            else
                break;
            fact = fact/10;
        }
        return count;
    }

    // To avoid overflow: Trailing zeroes are factors of 2,5 and 10 where 10 is again a factor of 5.
    // Since power of 5 is always less than power of 2 - consider 5 alone.
    // Divide the number by 5 on each iteration
    public int trailingZeroes(int A) {
        int count = 0;

        while(A > 0) {
            count += A/5;
            A /= 5;
        }

        return count;
    }
    public static void main(String[] args) {
        TrailingZerosFactorial obj = new TrailingZerosFactorial();
        System.out.println(obj.trailingZeroes(200));
    }
}
