package Iterator;

import java.util.Iterator;

/**
 * Created by admin on 27.05.2017.
 */
public class IteratorIterator implements Iterator<Iterator<Integer>> {
   /* public final class ClassConvert {
        public Iterator<Integer> convert(Iterator<Iterator<Integer>> iterator) {
            IteratorOneArray iteratorOneArray;
            int index = 0;
            int indexArrayIterators = 0;
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            return new IteratorOneArray(new Integer[]{5});
        }
    }*/

    public static void main(String[] args) {
        Integer[] a1 = {1, 5, 6, 76, 4};
        Integer[] a2 = {534, 434, 65, 343, 65};
        Integer[] a3 = {77, 88, 99, 0, 64, 900};

        IteratorOneArray[] iteratorOneArray = new IteratorOneArray[3];
        iteratorOneArray[0] = new IteratorOneArray(a1);
        iteratorOneArray[1] = new IteratorOneArray(a2);
        iteratorOneArray[2] = new IteratorOneArray(a3);
        IteratorIterator iterator = new IteratorIterator(iteratorOneArray, new int[]{iteratorOneArray[0].a.length, iteratorOneArray[1].a.length, iteratorOneArray[2].a.length});
        int i = 0;
        while (i++ < 16) {
            System.out.println(iterator.next().next());
        }
    }
    Iterator[] iterator;
    public int[] index;
    public int indexArrayIterators = 0;

    public IteratorIterator(Iterator[] iterator, int[] index) {
        this.index = index;
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        int quantityIts = iterator.length;
        int i = 0;
        for (int j = 0; j < quantityIts; j++) {
            while (iterator[j].hasNext()) {
                iterator[j].next();
                i++;
            }
        }
        return index < i;
    }

    @Override
    public Iterator<Integer> next() {
        if (iterator[indexArrayIterators].hasNext()) {
           return  iterator[indexArrayIterators];
        } else {
            return  iterator[++indexArrayIterators];
        }
    }

    @Override
    public void remove() {

    }
}
