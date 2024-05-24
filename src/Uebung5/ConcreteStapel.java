package Uebung5;

import java.util.ArrayList;

public class ConcreteStapel<T> implements Stapel {

    /*
     * void pop()
     * Object top()
     * push(Object e)
     * boolean isEmpty()
     *
     * Stapel als Dynamisches Array mit Start groeße 2
     */

    ArrayList<T> stapel;

    public ConcreteStapel(){
        stapel = new ArrayList<>();
    }

    @Override
    public void pop() {
        stapel.remove(stapel.size()-1);
    }

    @Override
    public T top() {
        return null;
    }

    @Override
    public void pushElement(Object e) {

    }

    @Override
  public void push(Object object){
      stapel.add((T) object);
  }

    @Override
    public boolean isEmpty() {
        return stapel.isEmpty();
    }
}
