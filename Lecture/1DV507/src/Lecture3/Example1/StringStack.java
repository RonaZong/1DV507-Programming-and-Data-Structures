package Lecture3.Example1;

public interface StringStack {
    int size();  // current stack size
    boolean isEmpty();  // true if stack is empty
    void push(String str);  // add string at top of stack
    String pop();  // return and remove top string
    //  Throws StackException if stack is empty
    String peek();  // return (without removing) top element
    //  Throws StackException if stack is empty
}
