package List;

import com.sun.org.apache.xml.internal.serializer.ElemDesc;

import java.util.Iterator;
import java.util.LinkedList;


public class ContainerLinkedList<E> implements Iterable<E> {

    private int index = 0;
    Entry first = null;
    Entry last = null;
    protected class IteratorList<E> implements Iterator<E> {
        Entry first;
        Entry last;

        public IteratorList(Entry first, Entry last) {
            this.first = first;
            this.last = last;
        }

        @Override
        public boolean hasNext() {
            if (this.first != null) {
                while (last != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public E next() {
            Entry next = first;
            first = next;
            first = first.next;
            return (E) next.element;
        }

        @Override
        public void remove() {

        }
    }

    @Override
    public Iterator<E> iterator() {
        return new IteratorList(this.first, this.last);
    }
    /*Необходимо создать контейнер с методами
    add(E value);
    E get(int index);
    То есть метод add(E value) - может принимать бесконечное количество элементов.*/
    protected class Entry {
        Object element;

        Entry prev = null;
        Entry next = null;

        public Entry(E element) {
            this.element = element;
        }
    }
    public void add(E element) {
        if (first == null) {
            first = new Entry(element);
        } else if (last == null) {
            last = new Entry(element);
            first.next = last;
            last.prev = first;
        } else {
            Entry entry = last;
            last = new Entry(element);
            entry.next = last;
            last.prev = entry;
        }
        index++;
    }

    public E get(int index) {
        int tempIndex = 0;
        Entry entry = first.next;
        do {
            if (tempIndex == 0) {
                if (index == tempIndex) {
                    return (E) first.element;
                }
            } else if (tempIndex == 1) {
                if (index == tempIndex) {
                    return (E) first.next.element;
                }
            } else {
                entry = entry.next;
                if (index == tempIndex) {
                    return (E) entry.element;
                }
            }
        } while (tempIndex++ != index);
        return null;
    }
}
