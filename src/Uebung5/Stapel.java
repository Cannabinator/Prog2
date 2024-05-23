package Uebung5;

public interface Stapel<T> {
    public void pop();
    public T top();
    public void push(T e);
    public boolean isEmpty();
}
