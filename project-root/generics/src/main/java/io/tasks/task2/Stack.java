package io.tasks.task2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;

public class Stack<E> {
    private Deque<E> stack;

    public Stack() {
        this.stack = new ArrayDeque<>();
    }

    public E push(E element) {
        stack.offerLast(element);
        return peek();
    }

    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.pollLast();
    }

    public E peek() {
        return stack.peekLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
