package Generic;

import java.util.EmptyStackException;

public interface GenericStack <T> {
    void push(T object) throws FullStackException;
    T pop() throws EmptyStackException;
    T peek() throws EmptyStackException;
    boolean isEmpty();
}
