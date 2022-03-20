package io.twoPointers;

public class ClosestPair {
    public int[] solve(int[] A, int[] B, int C) {
        int[] result = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        int ptr1=0;
        int ptr2 = B.length-1;
        int closestSum = Integer.MAX_VALUE;

        while(ptr1<A.length && ptr2>=0) {
            int sum = Math.abs(A[ptr1]+B[ptr2]-C);

            if(sum < closestSum){
                result[0] = A[ptr1];
                result[1] = B[ptr2];
                closestSum = sum;
            } else if(sum == closestSum) {
                if(A[ptr1] < result[0]) {
                    result[0] = A[ptr1];
                    result[1] = B[ptr2];
                    closestSum = sum;
                } else if(A[ptr1] == result[0]) {
                    if(A[ptr2] < result[1]) {
                        result[0] = A[ptr1];
                        result[1] = B[ptr2];
                        closestSum = sum;
                    }
                }
            }

            if(A[ptr1] + B[ptr2] > C)
                ptr2--;
            else
                ptr1++;
        }
        return result;
    }

    public static void main(String[] args) {
        ClosestPair obj = new ClosestPair();
        int[] a = new int[]{1};
        int[] b = new int[]{2, 4};
        int c = 4;
        int[] result = obj.solve(a,b,c);

        for(int i:result)
            System.out.println(i);
    }
}
