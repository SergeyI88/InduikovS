package methods_objects;

/**
 * @author SergeyI
 * @since 01.11.2017
 *
 * Here this is class show us how are working two threads in one queue.
 */
public class ProducerCustomer<E> {
    Node<E> node = new Node<>();
    Object lock = new Object();

    public void add(E o) {
        synchronized (lock) {
            if (node == null) {
                node = new Node<E>(o);
            } else if (node.next == null) {
                node.next = new Node(o);

            } else {
                Node<E> temp = node;
                node = node.next;
                add(o);
                node = temp;
            }
                lock.notify();
        }
    }

    public E get() {
        Node<E> temp;
        synchronized (lock) {
            temp = new Node<>();
            if (node != null) {
                temp = node;
                node = node.next;
            } else {
                System.out.println("any");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return temp.object;
    }

    private class Node<E> {
        Node next;
        E object;

        public Node(E e) {
            object = e;
        }

        public Node() {
        }
    }


}
