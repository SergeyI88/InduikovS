package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user8.3 on 30.05.2017.
 */
public class IteratorIterator {
    public static void main(String[] args) {
        Iterator<Integer> first = Arrays.asList(1, 2, 3).iterator();
        Iterator<Integer> second = Arrays.asList(4, 5, 6).iterator();
        Iterator<Iterator<Integer>> it = Arrays.asList(first, second).iterator();
        Iterator<Integer> iter = convert(it);
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    private static Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        It iterator = new It(it);
        int j= 0;
        return iterator;
    }
    public static class It implements Iterator {
        private Iterator<Iterator<Integer>> list;
        private ArrayList<Iterator<Integer>> arrayList = new ArrayList<>();
        int index = 0;

        public It(Iterator<Iterator<Integer>> list) {
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
        public Object next() {
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
}