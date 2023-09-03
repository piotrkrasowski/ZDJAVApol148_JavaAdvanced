package Day02.Exercise03;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        try {
            stack.push("Pierwszy");
            stack.push("Drugi");
            stack.push("Trzeci");

            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Is Empty: " + stack.isEmpty());

            System.out.println("Pop: " + stack.pop());
            System.out.println("Is Empty: " + stack.isEmpty());
        } catch (FullStackExceptions | EmptyStackExceptions e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
