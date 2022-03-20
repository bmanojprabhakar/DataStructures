package io.stack;

import java.util.Stack;

public class RedundantBraces {
    public int braces(String A) {
        Stack<Character> stack = new Stack<>();

        for(char c: A.toCharArray()) {
            if(c == ')') {
                char top = stack.pop();
                if(stack.isEmpty())
                    return 1;
                else if(top == '(')
                    return 1;
                else {
                    int count = 0;
                    while(top!='(') {
                        top = stack.pop();
                        count++;
                    }
                    if(count == 1)
                        return 1;
                }
            } else {
                stack.push(c);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        RedundantBraces obj = new RedundantBraces();
        System.out.println(obj.braces("((a+b))"));
    }
}
