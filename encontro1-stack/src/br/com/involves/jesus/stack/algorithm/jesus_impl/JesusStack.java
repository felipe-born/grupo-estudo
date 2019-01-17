package br.com.involves.jesus.stack.algorithm.jesus_impl;

import br.com.involves.jesus.stack.algorithm.Stack;

public class JesusStack<E> implements Stack<E> {

    private StackNode<E> top = new StackNode<>(null, null);
    private int size = 0;

    @Override
    public E push(E element) {
        this.top = new StackNode<>(element, top);
        size++;

        return top.element();
    }

    @Override
    public E pop() {
        if (size == 0)
            return null;

        size--;

        E popped = top.element();

        top = top.prev();

        return popped;
    }

    @Override
    public E top() {
        return top.element();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
