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
        stapel.remove(top());
    }

    @Override
    public T top() {
        return stapel.get(stapel.size()-1);
    }

    @Override
    public void pushElement(Object e) {
        System.out.println(-1);
    }

    @Override
  public void push(Object object){
      stapel.add(stapel.size()-1, (T) object);
  }

    @Override
    public boolean isEmpty() {
        return stapel.isEmpty();
    }
}
