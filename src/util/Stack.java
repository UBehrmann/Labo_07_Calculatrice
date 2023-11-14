package util;

import java.util.EmptyStackException;

public class Stack<T> {
    private Node<T> first;
    private int size;

    public void push(T value){
        this.first = new Node<>(value, this.first);
        this.size++;
    }
    public void pop(){
        if(this.first == null){
            throw new EmptyStackException();
        }
        this.first = this.first.getNext();
        this.size--;

    }
    public Object[] toArray(){
        Object[] tb     = new Object[this.size];
        int idx         = 0;
        Node<T> first   = this.first;
        while (first != null){
            tb[idx++] = first.getValue();
            first = first.getNext();
        }
        return tb;
    }
    public StackIterator<T> iterator(){
        return new StackIterator<>(first);
    }

    public String toString(){
        String resultat = "[";
        Node<T> first = this.first;
        while(first != null){
            resultat += (" " + first.getValue());
            first = first.getNext();
        }
        resultat += "]";
        return resultat;
    }
    public int size(){
        return size;
    }
}
