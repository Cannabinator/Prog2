package Uebung5;

public interface Stapel<T> {
    public void pop();
    public T top();
    public void pushElement(T e);
    public boolean isEmpty();
}
