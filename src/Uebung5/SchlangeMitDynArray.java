package Uebung5;

import Interfaces.Schlange;

import java.util.EmptyStackException;
import java.util.Iterator;

public class SchlangeMitDynArray<T> implements Schlange<T> {

    private DynArray<T> schlange;

    public SchlangeMitDynArray() {
        schlange = new DynArray<>();
    }


    @Override
    public T front() {
        return schlange.get(0);
    }

    @Override
    public void enQ(T e) { // add element e at the end of the snake
        schlange.add(e);
    }

    @Override
    public void deQ() {
        if (schlange.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        schlange.remove(0);
    }


    @Override
    public String toString() {
        String ret="";
        for(T e: schlange){
            ret+=e.toString()+" ";
        }
        return "Schlange :" + ret;
    }
}
