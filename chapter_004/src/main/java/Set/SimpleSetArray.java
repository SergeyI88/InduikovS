package Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * Created by admin on 10.06.2017.
 */
public class SimpleSetArray<E> implements Iterable<E> {

    public SimpleSetArray() {
        this.objects = new Object[10];
    }

    private Object[] objects;
    private int index = 0;

    @Override
    public Iterator<E> iterator() {
        return new IteratorSet<>(objects);
    }

    public boolean add(E value) {
        if (alreadyContainsFalse(value)) {
            if (index < objects.length) {
                objects[index++] = value;
            } else {
                System.arraycopy(objects, 0, objects, 0, objects.length + (objects.length >> 1));
                objects[index++] = value;
            }
            return true;
        } else
            return false;

    }

    private boolean alreadyContainsFalse(E value) {
        for (Object o : objects) {
            if (o != null && o.equals(value)) {
                return false;
            }
        }
        return  true;
    }

    public int size() {
        return index;
    }

    private class IteratorSet<E> implements Iterator<E> {
        private Object[] objects;
        private int index = 0;

        public IteratorSet(Object[] objects) {
            this.objects = objects;
        }

        @Override
        public boolean hasNext() {
            return index < objects.length && objects[index] != null;
        }

        @Override
        public E next() {
            return (E) objects[index++];
        }

        @Override
        public void remove() {

        }
    }

}

