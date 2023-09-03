package Generic;

import java.util.Arrays;
import java.util.EmptyStackException;

public class GenericArrayStack<T> implements GenericStack<T> {
    private T[] stackData = (T[]) new Object[10];
    Integer top = 0;

    @Override
    public void push(T object) throws FullStackException {
        if (top <= stackData.length - 1)
        {
            stackData[top] = object;
            top++;
        } else{
            throw new FullStackException("Full Stack Exception");
        }
    }

    @Override
    public T pop() throws EmptyStackException {
        if (top == 0) {
            throw new EmptyStackException();
        } else {
            top--;
            T object = stackData[top];
            stackData[top] = null;
            return object;
        }
    }

    public T peek() {
        if (top > 0)
            return stackData[top -1];
        else
            throw new EmptyStackException();
    }


    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public String toString() {
        return "GenericArrayStack{" +
                "stackData=" + Arrays.toString(stackData) +
                '}';
    }
}
