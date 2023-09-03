package Exercise03;


interface Stack {
    void push(String item) throws FullStackExceptions;

    String pop() throws EmptyStackExceptions;

    String peek() throws EmptyStackExceptions;

    boolean isEmpty();
}

class FullStackExceptions extends Exception {
    public FullStackExceptions() {
        super("Full stack exception");
    }
}

class EmptyStackExceptions extends Exception {
    public EmptyStackExceptions() {
        super("Empty stack exception");
    }
}

class ArrayStack implements Stack {
    private String[] stackData;
    private int buffer = 3;
    private int top;

    public ArrayStack() {
        stackData = new String[buffer];
        top = -1;
    }


    @Override
    public void push(String item) throws FullStackExceptions {
        if (top >= buffer - 1) {
            throw new FullStackExceptions();
        }
        stackData[++top] = item;
    }

    @Override
    public String pop() throws EmptyStackExceptions {
        if (isEmpty()) {
            throw new EmptyStackExceptions();
        }
        String poppedItem = stackData[top];
        stackData[top--] = null;
        return poppedItem;
    }

    @Override
    public String peek() throws EmptyStackExceptions {
        if (isEmpty()) {
            throw new EmptyStackExceptions();
        }
        return stackData[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}

