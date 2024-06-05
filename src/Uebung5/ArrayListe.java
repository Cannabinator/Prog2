package Uebung5;

import Interfaces.Liste;

/**
 * @author akless
 * @licence MIT
 */

public class ArrayListe<T> implements Liste<T> {

    /* Instanzvariablen */

    private T[] elements;
    private int size;

    /* Konstruktoren */

    public ArrayListe() {
        this.elements = (T[]) new Object[3];
        this.size = 0;
    }

    /* Instanzmethoden */

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public T get() {
        return elements[0];
    }

    @Override
    public void insert(T elem) {
        if (size == elements.length) return;

        for (int i = size; i >= 1; i--) {
            elements[i] = elements[i-1];
        }
        elements[0] = elem;
        size++;
    }

    @Override
    public void remove() {
        if (isEmpty()) return;

        for (int i = 0; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        size--;
    }

    @Override
    public String toString() {
        return "ArrayListe{" +
                "elements=" + java.util.Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
