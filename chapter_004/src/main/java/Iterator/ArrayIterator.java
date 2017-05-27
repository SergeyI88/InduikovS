package Iterator;

import java.util.Iterator;

/**
 * Created by admin on 24.05.2017.
 */
public class ArrayIterator implements Iterator<Integer> {
    Integer[][] a;
    private int index = 0;
    private int indexRow = 0;
    private int indexColl = 0;

    public ArrayIterator(Integer[][] a) {
        this.a = a;
    }

    @Override
    public boolean hasNext() {
        if(index < a.length * a[0].length) {
            return true;
        }

        return false;
    }

    @Override
    public Integer next() {
        index++;
        if (indexColl == a.length) {
            indexRow++;
            indexColl = 0;
        }
        return a[indexRow][indexColl++];
    }

    @Override
    public void remove() {
    }
}
