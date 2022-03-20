package io.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SortStack {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Stack<Integer> inputStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        inputStack.addAll(A);

        while(!inputStack.isEmpty()) {
            int temp = inputStack.pop();

            while(!tempStack.isEmpty() && tempStack.peek() > temp) {
                inputStack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        ArrayList<Integer> al = new ArrayList<>();
        al.addAll(tempStack);
        return al;
    }

    public static void main(String[] args) {
        SortStack obj = new SortStack();
        System.out.println(obj.solve(new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1))));
    }
}
