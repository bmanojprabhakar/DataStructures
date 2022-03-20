package io.problemSolving;

public class ExcelColumnTitle {
    public String convertToTitle(int A) {
        StringBuilder columnName = new StringBuilder();

        while(A > 0) {
            if(A % 26 == 0) {
                columnName.append("Z");
                A = A/26 - 1;
            } else {
                columnName.append((char) (65 + A%26 - 1));
                A /= 26;
            }
        }
        return columnName.reverse().toString();

    }
    public static void main(String[] args) {
        ExcelColumnTitle obj = new ExcelColumnTitle();
        System.out.println(obj.convertToTitle(52));
    }
}
