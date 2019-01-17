package br.com.involves.jesus.stack.algorithm;

public interface Stack<E> {

    // Adicionar elemento no topo da pilha
    E push(E element);
    // desempilha o elemento do topo
    E pop();
    // mostra o elemento do topo (sem remover)
    E top();

    boolean isEmpty();
    int size();
}
