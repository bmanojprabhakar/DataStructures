package io.strings;

public class ReverseTheString {
    public String solve(String A) {
        String[] splitString = A.trim().replaceAll(" +"," ").split(" ");
        String result="";

        for(int i=splitString.length-1;i>=0;i--) {
            result += splitString[i];

            if(i>0)
                result += " ";
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseTheString obj = new ReverseTheString();
        System.out.println(obj.solve("qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo"));
    }
}
