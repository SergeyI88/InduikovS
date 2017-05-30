package Iterator;

import java.util.Iterator;

/**
 * Created by user8.3 on 24.05.2017.
 */
public class IteratorArray implements Iterator<Integer> {
    private int[] array;
    private int index = 0;

    public IteratorArray(int[] array) {
        this.array = array;
    }

    public boolean hasNext() {
        if (index < array.length) {
            for (int i = 0; i < array.length - index; i++) {
                if (array[index + i] %2 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Integer next() {
        while (array[index] % 2 != 0) {
           index++;
        }
        return array[index++];
    }

    @Override
    public void remove() {

    }
}