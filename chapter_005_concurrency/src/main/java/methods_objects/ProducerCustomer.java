package methods_objects;

import java.util.LinkedList;

/**
 * @author SergeyI
 * @since 01.11.2017
 * <p>
 * Here this is class show us how are working two threads in one queue.
 */
public class ProducerCustomer<E> {
    LinkedList<E> list = new LinkedList<>();

    public void add(E o) {
        synchronized (list) {
            list.add(o);
            list.notify();
        }
    }

    public E get() {
        Object e;
        synchronized (list) {
            if (list.isEmpty()) {
                try {
                    list.wait();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
            e = list.remove(0);
        }
        return (E) e;
    }

}
