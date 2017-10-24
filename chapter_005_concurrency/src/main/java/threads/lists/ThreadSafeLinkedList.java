
package threads.lists;
import java.util.Iterator;

/**
 * The class demonstrates the collection in multi-threaded mode.
 *
 * @author  by Sergey on 13.10.2017.
 * @version 1.0
 */
public class ThreadSafeLinkedList<E> implements Iterable<E> {
    /**
     * It is objects in which to contains first and last elements.
     */
    Node first;
    Node last;

    /**
     * The method add an item in our collection
     * @param object - the item to be added
     */
    public synchronized void add (E object) {
        Node<E> node = new Node<>(object);
        if (first == null) {
            first = node;
        } else if (last == null) {
           last = node;
           last.prev = first;
           first.next = last;
        } else {
            Node<E> temp = last;
            temp.prev.next = temp;
            temp.next = node;
            last = node;
            node.prev = temp;
        }
    }

    /**
     * The method edit an item in our collection
     * @param object - the item to be edited
     */
    public synchronized void edit(E object) {
        Node<E> temp = first;
        while (temp.next != null) {
            if (temp.object.equals(object)) {
                temp.object = object;
            }
            temp = temp.next;
        }
    }

    /**
     * The method delete an item in our collection
     * @param object - the item to be removed
     */
    public synchronized void remove(E object) {
        Node<E> temp = first;
        while (temp.next != null) {
            if (first.object.equals(object)) {
                first = first.next;
            } else if (temp.object.equals(object)) {
                Node<E> forChangeLinks = temp;
                temp.next.prev = temp.prev;
                temp.prev.next = temp.next;
            }
            temp = temp.next;
        }
    }

    /**
     * The method is giving away iterator our collection
     */
    @Override
    public Iterator<E> iterator() {
        return new InsideIterator(first);
    }

    private class Node<E> {
        E object;
        Node<E> prev;
        Node<E> next;

        public Node(E object) {
            this.object = object;
        }

        public Node() {

        }
    }

    /**
     * The inner class realizationing iterator
     */
    private class InsideIterator implements Iterator<E> {
        protected Node<E> node;
        public InsideIterator(Node<E> first) {
            this.node = first;
        }

        @Override
        public boolean hasNext() {
            try {
                return node.next != null;
            } catch (NullPointerException e) {
                e.printStackTrace();
                System.out.println("Объектов больше нет!");
            }
            return false;
        }

        @Override
        public E next() {
            Node<E> temp = node;
            node = node.next;
            return temp.object;
        }
    }
    public static void main(String[] args) {
        ThreadSafeLinkedList<Integer> list = new ThreadSafeLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.first.object);
        System.out.println(list.last.object);
        System.out.println(list.first.next.object);
        System.out.println(list.first.next.prev.object);
    }
}
