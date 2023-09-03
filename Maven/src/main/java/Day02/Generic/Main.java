package Day02.Generic;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        stringTest();
        integerTest();
    }

    public static void stringTest() {
        Stack<String> stack = new Stack<>();

        stack.push("Test 1");
        stack.push("Test 2");
        stack.push("Test 3");
        stack.push("Test 4");
        stack.push("Test 5");
        System.out.println("String Pop1: " + stack.pop());
        System.out.println("String Pop2: " + stack.pop());
        System.out.println("String Pop3: " + stack.pop());
        System.out.println("String Peek1: " + stack.peek());



    }
    public static void integerTest() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Integer Pop1: " + stack.pop());
        System.out.println("Integer Pop2: " + stack.pop());
        System.out.println("Integer Pop3: " + stack.pop());
        System.out.println("Integer Peek1: " + stack.peek());
    }
}
