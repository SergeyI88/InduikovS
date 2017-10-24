package threads.lists;

import java.util.Iterator;

/**
 * Class is demonstrating work collection in multi-threaded mode.
 *
 * @author by Sergey on 13.10.2017.
 */
public class ThreadSafeArrayList<E> implements Iterable<E> {
    /**
     * objects - values
     * index - index the last element
     */
    Object[] objects = new Object[10];
    int index = 0;

    /**
     * The method add an item in our collection
     * @param o - the item to be added
     */
    public synchronized void add(Object o) {
        if (index < objects.length) {
            objects[index++] = o;
        } else {
            System.arraycopy(objects, 0, objects, 0, objects.length);
        }
    }

    /**
     * The method edit an item in our collection
     * @param o - the item to be edited
     */
    public synchronized void edit(Object o) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                if (objects[i].equals(o)) {
                    objects[i] = o;
                }
            }
        }
    }

    /**
     * The method delete an item in our collection
     * @param o - the item to be removed
     */
    public synchronized void delete(Object o) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                if (objects[i].equals(o)) {
                    if (i < objects.length) {
                        objects[i] = objects[i + 1];
                    }
                }
            }
        }
    }

    /**
     * The method is giving away iterator our collection
     */
    @Override
    public synchronized Iterator<E> iterator() {
        return new InsideIterator<E>((E[]) this.objects);
    }

    /**
     * The inner class realizationing iterator
     * @param <E>
     */
    public class InsideIterator<E> implements Iterator<E> {
        private E[] objects;
        private int id = 0;

        public InsideIterator(E[] objects) {
            this.objects = objects;
        }

        @Override
        public boolean hasNext() {
            return objects[id] != null;
        }

        @Override
        public E next() {
            return objects[id++];
        }
    }
}
