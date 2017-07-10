package map;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by admin on 09.07.2017.
 */
public class Directory<T, V> implements Iterable {
    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.insert(1, "1");
        directory.insert(2, "2");
        directory.insert(3, "3");
        directory.insert(4, "4");
        directory.insert(5, "5");
        directory.insert(6, "5");
        directory.insert(7, "5");
        directory.insert(8, "5");
        directory.insert(9, "5");
        directory.insert(10, "5");
        // System.out.println(directory.delete(1));
        System.out.println(directory.delete(10));
        System.out.println(directory);
    }

    Entry entry[];
    private int length;

    public Directory() {
        length = 0;
        this.entry = new Entry[10];
        for (int i = 0; i < entry.length; i++) {
            entry[i] = new Entry();
        }
    }

    public boolean insert(T key, V value) {
        if (isEmpty(key)) {
            if (length >= entry.length) {
                System.arraycopy(entry, 0, entry, 0, ((entry.length + entry.length >> 1)));

            }
            entry[length] = new Entry();
            entry[length].setKey(key);
            entry[length++].setValue(value);
        }
        return false;
    }

    public V get(T key) {
        for (Entry k : entry) {
            if (k == null) {
                return null;
            } else if (k.key.hashCode() == key.hashCode() || k.key.equals(key)) {
                return (V) k.getValue();
            } else {
                return null;
            }
        }
        return null;
    }

    public boolean delete(T key) {
        for (int i = 0; i < entry.length; i++) {
            if (entry[i].getKey().equals(key)) {
                for (int j = i; j < entry.length; j++) {
                    if (j == entry.length - 1) {
                        entry[j] = null;
                    } else {
                        entry[j] = entry[j + 1];
                        System.out.println("log");
                    }
                }
                return true;
            }
        }
        return false;
    }

    private boolean isEmpty(T key) {
        for (Entry k : entry) {
            if (k.getKey() == null) {
                return true;
            }
            if (k.getKey().hashCode() == key.hashCode()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator<Entry> iterator() {
        return new IteratorMap<Entry>(entry);
    }

    private class IteratorMap<E> implements Iterator<E> {
        int length = 0;
        private Entry entry[];

        public IteratorMap(Entry[] entry) {
            this.entry = entry;
        }

        @Override
        public boolean hasNext() {
            if (length < this.entry.length) {
                if (this.entry[length].key == null) {
                    return false;
                }
            }
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

    public class Entry<T, V> {
        protected Object key;
        protected Object value;

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
        return Arrays.toString(entry);
    }
}
