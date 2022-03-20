package io.strings;

public class CountA {
    public int solve(String A) {
        int result = 0;

        for(int i=0;i<A.length();i++) {
            if(A.charAt(i)=='a')
                result++;
        }

        return result*(result+1)/2;
    }
    public static void main(String[] args) {
        CountA obj = new CountA();
        System.out.println(obj.solve("fnmzxvozgkpkwuuwbnlbajogijoaxipjwwfaqefjnvfbcilerkdaeysamehgdouvspojtuvh"));
    }
}
