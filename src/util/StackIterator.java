package util;
import java.util.NoSuchElementException;

public class StackIterator<T> {
    private Node<T> node;
    public StackIterator(Node<T> node){
        this.node = node;
    }
    public T next(){
        if (this.node == null) {
            throw new NoSuchElementException("L'element pointe n'existe pas !");
        }
        T value     = this.node.getValue();
        this.node   = this.node.getNext();
        return value;
    }
    public boolean hasNext(){
        return this.node.getNext() != null;
    }
}
