package day_60_collections;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        System.out.println("Top of my stack: " + stack.peek()); // returns what is at top of your stack --> last element added

        stack.pop(); // removes the element of the top of the stack,and returns it
        System.out.println(stack);

        System.out.println("Top of my stack: " + stack.peek());

        System.out.println(stack.pop()); // removes c which is at top at the stack and returns it
        System.out.println(stack);

        System.out.println(stack.remove(0)); // remove the element at index 0, not following LIFO anymore at this method

        System.out.println(stack);

    }
}
