package Uebung5;

import Interfaces.Stapel;

import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * Datenstruktur (DS): Stack basierend auf dynamischem Array
 * @author ChatGPT
 * @licence MIT
 */
public class Stack<T> implements Stapel<T> {

    /* Instanzvariablen */

    private DynArray<T> array;

    /* Konstruktoren */

    public Stack() {
        array = new DynArray<>();
    }

    /* Instanzmethoden */

    /**
     * Überprüft, ob der Stack leer ist.
     * @return true, wenn der Stack leer ist, sonst false.
     */
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array.get(array.size() - 1);
    }

    /**
     * Gibt die Anzahl der Elemente im Stack zurück.
     * @return die Anzahl der Elemente im Stack.
     */
    public int size() {
        return array.size();
    }

    /**
     * Fügt ein Element auf den Stack.
     * @param e das einzufügende Element.
     */
    public void push(T e) {
        array.add(e);
    }

    /**
     * Entfernt das oberste Element vom Stack und gibt es zurück.
     * @return das oberste Element des Stacks.
     * @throws EmptyStackException wenn der Stack leer ist.
     */
    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        array.remove(array.size() - 1);
    }
    /**
     * Gibt eine String-Repräsentation des Stacks zurück.
     * @return eine String-Repräsentation des Stacks.
     */
    @Override
    public String toString() {
        return "Stack{" +
                "array=" + array +
                '}';
    }

    /**
     * Gibt einen Iterator über die Elemente im Stack zurück.
     * @return ein Iterator über die Elemente im Stack.
     */
    public Iterator<T> iterator() {
        return array.iterator();
    }
}

