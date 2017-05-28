package Iterator;

import java.util.Iterator;

/**
 * Created by admin on 27.05.2017.
 */
public class IteratorOneArray implements Iterator<Integer> {
    public int index = 0;

    public IteratorOneArray(Integer[] a) {
        this.a = a;
    }

    public Integer[] a;
    @Override
    public boolean hasNext() {
        return index < a.length;
    }

    @Override
    public Integer next() {
        return a[index++];
    }

    @Override
    public void remove() {

    }
}
