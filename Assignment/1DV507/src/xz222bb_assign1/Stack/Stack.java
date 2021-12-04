package xz222bb_assign1.Stack;

import java.util.concurrent.ArrayBlockingQueue;

public class Stack implements StringStack {
    private int size;
    private String[] stack;

    public Stack() {
        stack = new String[8];
    }

    @Override /* Current stack size */
    public int size() {
        size = 0;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null)
                size++;
        }
        return size;
    }

    @Override /* true if stack is empty */
    public boolean isEmpty() {
        return size == 0;
    }

    @Override /* Add element at top of stack */
    public void push(String element) {
        stack[size++] = element;
    }

    @Override /* Return and remove top element, exception if stack is empty */
    public String pop() throws IndexOutOfBoundsException {
        String element = this.stack[stack.length - 1];
        stack[size] = null;
        size--;
        return element;
    }

    @Override /* Return (without removing) top element, exception if stack is empty. */
    public String peek() throws IndexOutOfBoundsException{
        return stack[size];
    }

    public void printStack(String[] stack) {
        for (String s : stack) {
            System.out.print(s + " ");
        }
    }
}
