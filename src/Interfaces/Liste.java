package Interfaces;
/**
 * @author akless
 *
 */

public interface Liste<T> {

    /**
     * Liefert die Anzahl der in der Liste enthaltenen Objekte.
     * @return Anzahl der Objekte
     */
    int size();

    /**
     * Gibt zurück, ob die Liste leer ist.
     * @return true, wenn leer
     */
    boolean isEmpty();

    /**
     * Liefert das erste Objekt in der Liste.
     * @return erste Objekt in Liste
     */
    T get();

    /**
     * Fügt ein Objekt vorne in der Liste ein.
     * @param elem einzufügende Objekt
     */
    void insert(T elem);

    /**
     * Entfernt das erste Objekt in der Liste.
     */
    void remove();
}
