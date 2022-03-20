package io.stack;

import java.util.Stack;

public class BalancedParanthesis {
    static int isBalanced(String A) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<A.length();i++) {
            char c = A.charAt(i);

            if(c=='{' || c=='[' || c=='(') {
                stack.push(c);
                continue;
            }

            if(stack.isEmpty())
                return 0;

            char popedElement;

            switch(c) {
                case '}':
                    popedElement = stack.pop();
                    if(popedElement == '(' || popedElement == '[')
                        return 0;
                    break;
                case ')':
                    popedElement = stack.pop();
                    if(popedElement == '{' || popedElement == '[')
                        return 0;
                    break;
                case ']':
                    popedElement = stack.pop();
                    if(popedElement == '(' || popedElement == '{')
                        return 0;
                    break;
            }
        }
        return stack.isEmpty()?1:0;
    }
}
