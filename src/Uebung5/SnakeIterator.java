package Uebung5;

import java.util.Iterator;

public class SnakeIterator<T> implements Iterator<T> {

    private T [][] array;
    private int i;
    private int j;
    public boolean forward;

    public SnakeIterator(T [][] array) {
        this.array = array;
        i = 0;
        j = 0;
        forward=(array[i].length%2==0?true:false);
    }

    @Override
    public boolean hasNext() {
        return (i>=0&&i<array.length&&j>=0&&j<=array[i].length);
        //return (i < array.length && (i % 2 == 0 ? j < array[i].length : j >= 0));
    }

    @Override
    public T next() {
        T v = array[i][j];
        if(forward){
            j++;
            if(j>=array[i].length){
                i++;
            }
            else{
                i=array.length-1;
                j++;
                if(j>=array[i].length){
                    i--;
                }
            }
        }
        return v;
    }
}
