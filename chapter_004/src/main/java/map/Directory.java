package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Class directory
 *
 * @author sergey
 * @param <T>
 * @param <V>
 */
public class Directory<T, V> implements Iterable {
    /**
     * Array linkedlists
     */
    LinkedList<Entry> lists[];

    /**
     * Constructor
     */
    public Directory() {
        this.lists = new LinkedList[100];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new LinkedList<>();
        }
    }

    /**
     * Paste in directory
     * @param key should be uniquie.
     * @param value
     * @return
     */
    public boolean insert(T key, V value) {
        if (notExists(key)) {
            lists[key.hashCode() % lists.length].add(new Entry<>(key, value));
        }
        return false;
    }

    /**
     * Method get find value by the key.
     * @param key
     * @return value.
     */
    public V get(T key) {
        Object value = null;
        for (Entry e : lists[key.hashCode() % lists.length]) {
            if (key.equals(e.getKey())) {
                value = e.getValue();
            }
        }
        return (V) value;
    }

    /**
     * Method delete, remove Entry by the key
     * @param key
     * @return
     */
    public boolean delete(T key) {
        boolean result = false;
        for (int i = 0; i < lists[key.hashCode() % lists.length].size(); i++) {
            if (result = lists[key.hashCode() % lists.length].get(i).getKey().equals(key)) {
                lists[key.hashCode() % lists.length].remove(i);

            }
        }
        return result;
    }

    /**
     * Method notExists checks have direcory already it key.
     * @param key
     * @return
     */
    private boolean notExists(T key) {
        boolean result = true;
        for (LinkedList l : lists) {
            if (l.contains(key)) {
                return false;
            }
        }
        return result;
    }

    /**
     * Iterator
     * @return
     */
    @Override
    public Iterator<Entry> iterator() {
        return new IteratorMap<Entry>(lists);
    }

    /**
     * Class IteratorMap need for directory
     *
     * @param <E>
     */
    private class IteratorMap<E> implements Iterator<E> {
        int length = 0;
        private Object[] entry;

        public IteratorMap(LinkedList[] lists) {
            ArrayList<Entry> list = new ArrayList<>();
            for (LinkedList<Entry> l : lists) {
                if (!l.isEmpty()) {
                    list.addAll(l);
                }
            }
            entry = list.toArray();
        }

        @Override
        public boolean hasNext() {
            return length < this.entry.length;
        }

        @Override
        public E next() {
            return (E) this.entry[length++];
        }

        @Override
        public void remove() {

        }
    }

    /**
     * Class entry contains uniquie key and value.
     *
     * @param <T>
     * @param <V>
     */
    public class Entry<T, V> {
        protected Object key;
        protected Object value;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Entry() {
        }

        public T getKey() {
            return (T) key;
        }

        public void setKey(T key) {
            this.key = key;
        }

        public V getValue() {
            return (V) value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            if (key != null && value != null) {
                return key + "=" + value;
            }
            return null;
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(lists);
    }
}
