package io.strings;

public class SimplifyDirectoryPath {
    public String simplifyPath(String A) {
        String[] direcotryName = A.split("/");
        String absoluteName = direcotryName[direcotryName.length-1];

        if(absoluteName.matches("^[a-zA-Z0-9]*$"))
            return "/"+absoluteName;

        return "/";
    }
    public static void main(String[] args) {
        SimplifyDirectoryPath obj = new SimplifyDirectoryPath();
        System.out.println(obj.simplifyPath("/a/./b/../../c/"));
//        System.out.println(obj.simplifyPath("/.."));
    }
}
