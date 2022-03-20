package io.strings;

public class SmallestPrefixString {
    public String smallestPrefix(String A, String B) {
        StringBuilder middle = new StringBuilder();
        String first = String.valueOf(A.charAt(0));
        String last = String.valueOf(B.charAt(0));

        for(int i=1;i<A.length();i++) {
            if(A.charAt(i) < B.charAt(0))
                middle.append(A.charAt(i));
            else
                break;
        }
        return (first+middle+last);
    }

    public static void main(String[] args) {
        SmallestPrefixString obj = new SmallestPrefixString();
        System.out.println(obj.smallestPrefix("ababa", "ahahahah"));
    }
}
