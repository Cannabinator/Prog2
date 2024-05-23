package Uebung5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PostbotenIterator<T> implements Iterator<T> {
    T[] array;
    private int evenIndex;
    private int oddIndex;
    private int length;

    public PostbotenIterator(T[] array) {
        this.array = array;
        this.length = array.length;
        this.oddIndex = 1;
        this.evenIndex = ((array.length % 2 == 0) ? array.length - 2 : array.length - 1);

    }

    @Override
    public boolean hasNext() {
        if (oddIndex < length) {
            return true;
        }
        return evenIndex >= 0;
    }

    @Override
    public T next() {
        if(oddIndex < array.length ) {
            T nextElement = array[oddIndex];
            oddIndex += 2;
            return nextElement;
        }
        if(evenIndex >= 0) {
            T nextElement = array[evenIndex];
            evenIndex -= 2;
            return nextElement;
        }else  {
            throw new NoSuchElementException("fail in T next Iterator");
        }
    }

}