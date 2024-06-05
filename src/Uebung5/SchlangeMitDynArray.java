package Uebung5;

import Interfaces.Schlange;

import java.util.EmptyStackException;
import java.util.Iterator;

public class SchlangeMitDynArray<T> implements Schlange<T> {

    private MengeDynArray<T> schlange;
    private T first;
    private T last;

    public SchlangeMitDynArray() {
        schlange = new MengeDynArray<>();
        if(!schlange.isEmpty()){
            first = schlange.get();
        }
    }


    @Override
    public T front() {
        return schlange.get();
    }

    @Override
    public void enQ(T e) { // add element e at the end of the snake
        schlange.insert(e);
        last = e;
    }

    @Override
    public void deQ() {// remove the first element in the snake

            first = schlange.get();
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
