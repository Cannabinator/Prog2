package ListAndArrays;
/**
 * @author sw
 * @version EVL02
 *
 * EVL mit last
 *    implementiert die Methoden
 *       T getFirst()
 *       T getLast()
 *       void insert(T v)
 *       void append(T v)
 *       void removeFirst()
 *       void removeLast()
 *       boolean contains(T v)
 *       void delete(T v)
 *
 *       erlaubt sowohl LIFO- als auch FIFO-Strukturen
 *
 *
 */

import java.util.NoSuchElementException;


public class EVL<T> {


    private ListenElem first;
    private ListenElem last;
    private int size;

    // innere Klasse
    protected class ListenElem {
        T value;
        ListenElem next;

        ListenElem (T v) {
            value = v;
            next = null;
        }
    }

    ///////////////////////////////////

    public EVL() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public T getFirst() throws NoSuchElementException {
        // liefert value des vordersten Elems
        if (isEmpty())
            throw new NoSuchElementException("Liste leer");
        return first.value;
    }

    public T getLast() throws NoSuchElementException {
        // liefert value des letzten Elems
        if (isEmpty())
            throw new NoSuchElementException("Liste leer");
        return last.value;
    }

    public void insert(T v) {
        // fuegt vorne ein
        ListenElem neu = new ListenElem(v);
        neu.next = first;
        first = neu;

        // Sonderfall: einfuegen in leere Liste
        if (size == 0)
            last = neu;

        size++;
    }

    public void append(T v) {
        // fuegt hinten an

        // Sonderfall: anhaengen an leere Liste
        if (isEmpty()) {
            insert(v);
            return;
        }

        // Normalfall
        ListenElem neu = new ListenElem(v);
        last.next = neu;
        last = neu;
        size++;
    }

    public void removeFirst() {
        // entfernt das vorderste Element

        // Sonderfall: leere Liste
        if (isEmpty())
            return;

        // Normalfall
        first = first.next;
        size--;

        // Sonderfall: Liste nun leer
        if(isEmpty())
            last = null;

    }

    public void removeLast() {
        // entfernt das letzte Element

        // Sonderfall: leere Liste
        if(isEmpty())
            return;

        // Sonderfall: 1-elementige Liste
        if(size == 1) {
            first = null;
            last = null;
            size--;
            return;
        }

        // Normalfall: size >= 2
        ListenElem e = first;
        ListenElem tmp = first;
        // suche Element tmp auf das vorletzte Elem
        while(e.next != null) {
            tmp = e;
            e = e.next;
        }
        tmp.next = null;
        last = tmp;
        size--;
    }


    public void delete(T v) {
        // entfernt das erste Vorkommen eines Elements mit Eintrag v

        // Sonderfall: leere Liste
        if(isEmpty())
            return;

        ListenElem e = first;
        ListenElem tmp = first;

        // suche Element e mit Eintrag v
        while(e != null && !e.value.equals(v)) {
            tmp = e;
            e = e.next;
        }

        // Sonderfall: e = erstes Elem
        if(e == first) {
            removeFirst();
            return;
        }

        // Sonderfall: v nicht gefunden
        if (e == null)
            return;

        // Normalfall:
        tmp.next = e.next;
        size--;

        // Sonderfall: e = letztes Elem
        if(e == last) {
            last = tmp;
        }
    }

    public boolean contains(T v) {
        ListenElem e = first;

        // suche Element e mit Eintrag v
        while(e != null && !e.value.equals(v)) {
            e = e.next;
        }
        return (e != null);
    }

    @Override
    public String toString() {
        String s = "";
        ListenElem tmp = first;
        while (tmp!= null) {
            s += tmp.value + " ";
            tmp = tmp.next;
        }
        return s;
    }

}