package io.problemSolving;

public class RainWaterTrapped {
    public int trap(final int[] A) {
        int result =0, left = 0, right = A.length-1, lMax = 0, rMax=0;

        while(left <= right) {
            if(rMax <= lMax) {
                result += Math.max(0, rMax-A[right]);
                rMax = Math.max(rMax, A[right]);
                right--;
            } else {
                result += Math.max(0, lMax-A[left]);
                lMax = Math.max(lMax, A[left]);
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RainWaterTrapped obj = new RainWaterTrapped();
        int[] arr = {3,0,2,0,4};
        System.out.println(obj.trap(arr));
    }
}
