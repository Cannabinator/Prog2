package Interfaces;

public interface Schlange <T>{
    public T front();
    public void enQ(T e);// insert element at the end of the snake
    public void deQ();// remove first element
}
