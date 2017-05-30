package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user8.3 on 30.05.2017. commit task 152
 */
public class IteratorIterator implements Iterator {
    private Iterator<Iterator<Integer>> list;
    private ArrayList<Iterator<Integer>> arrayList = new ArrayList<>();
    private int index = 0;

    public static Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        IteratorIterator iterator = new IteratorIterator(it);
        int j = 0;
        return iterator;
    }

    public IteratorIterator(Iterator<Iterator<Integer>> list) {
        this.list = list;
        while (list.hasNext()) {
            arrayList.add(list.next());
        }
    }

    @Override
    public boolean hasNext() {
        if (index < arrayList.size()) {
            if (arrayList.get(index).hasNext()) {
                return true;
            } else {
                if (index + 1 < arrayList.size()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Integer next() {
        if (arrayList.get(index).hasNext()) {
            return arrayList.get(index).next();
        } else {
            return arrayList.get(++index).next();
        }
    }

    @Override
    public void remove() {

    }
}