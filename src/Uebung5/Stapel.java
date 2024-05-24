package Uebung5;

public interface Stapel<T> {
    public void pop();
    public T top();
    public void pushElement(T e);
    void push(Object object);
    public boolean isEmpty();
}
