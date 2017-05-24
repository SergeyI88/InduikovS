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
        Integer[] array = new Integer[a.length * a[0].length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                array[k++] = a[i][j];
            }
        }

        return array[index++];
    }

    @Override
    public void remove() {
    }
}
