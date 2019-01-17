package br.com.involves.jesus.stack.algorithm.wellington_impl;

import br.com.involves.jesus.stack.algorithm.Stack;

import java.util.LinkedList;

public class WellingtonStack<E> implements Stack<E> {

    private LinkedList<E> stack = new LinkedList<>();

    public WellingtonStack() {
        stack = new LinkedList<>();
    }

    @Override
    public E push(E element) {
        stack.add(element);
        return element;
    }

    @Override
    public E pop() {
        return stack.pollLast();
    }

    @Override
    public E top() {
        return stack.peekLast();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }
}
