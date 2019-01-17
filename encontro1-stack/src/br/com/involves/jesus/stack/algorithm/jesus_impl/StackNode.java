package br.com.involves.jesus.stack.algorithm.jesus_impl;

class StackNode<E> {
    private final E element;
    private final StackNode<E> prev;

    StackNode(E element, StackNode<E> prev) {

        this.element = element;
        this.prev = prev;
    }

    public E element() {
        return element;
    }

    public StackNode<E> prev() {
        return prev;
    }
}
