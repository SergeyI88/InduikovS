package List;

import java.util.Iterator;

/**
 * Created by admin on 01.06.2017.
 */
public class ContainerArrayList<E> implements Iterable<E> {
   private Object[] container;
   int index = 0;

    public ContainerArrayList(int size) {
        this.container = new Object[size];
    }
    public ContainerArrayList() {
        this.container = new Object[10];
    }

    @Override
    public Iterator<E> iterator() {
        return new IteratorList(container);
    }
    private class IteratorList implements Iterator<E> {
        Object[] objects;
        int index = 0;

        public IteratorList(Object[] objects) {
            this.objects = objects;
        }

        @Override
        public boolean hasNext() {
            return index < objects.length;
        }

        @Override
        public E next() {
            return (E) objects[index++];
        }

        @Override
        public void remove() {

        }
    }
    public void add(E element) {
        if (index < container.length) {
            container[index++] = element;
        } else {
            Object[] tempObjects = new Object[container.length + (container.length >> 1)];
            System.arraycopy(container, 0, tempObjects, 0, index);
            container = tempObjects;
            container[index++] = element;
        }
    }
    public E get(int position) {
        return (E) container[position];
    }
}
