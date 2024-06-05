package Uebung5;

import Interfaces.Stapel;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcreteStapel<T> implements Stapel<T> {
    /*
     * void pop()
     * Object top()
     * push(Object e)
     * boolean isEmpty()
     *
     * Stapel als Dynamisches Array
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
    public void push(T e){
      stapel.add(e);
  }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return stapel.isEmpty();
    }

    @Override
    public String toString(){
        String ret = "";
        for(int i=0;i<stapel.size()-1;i++){
            ret += " "+stapel.get(i);
        }
        return ret;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
