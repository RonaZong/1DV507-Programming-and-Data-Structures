package xz222bb_assign1.Stack;

import java.util.Arrays;

public class StackMain {
    public static void main(String[] args) {
        StringStack stack = new Stack();

        System.out.println("Testing " + stack.getClass().getName());
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.toString();

        System.out.println(stack.size());
        System.out.println("Remove peek " + stack.pop());
        stack.pop();
        System.out.println(stack.size());
        System.out.println("The peek is " + stack.peek());
    }
}





