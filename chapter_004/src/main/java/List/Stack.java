package List;

import java.util.Iterator;

/**
 * Created by admin on 10.06.2017.
 */
public class Stack<E> extends ContainerLinkedList<E> {
    public static void main(String[] args) {
        Stack<Integer> queue = new Stack<>();
        queue.add(11);
        queue.add(12);
        queue.add(13);
        System.out.println(queue.getElement());
        System.out.println(queue.getElement());
        System.out.println(queue.getElement());
        //  System.out.println(queue.getElement());

    }

    public E getElement() {
        Object object = null;

        if (last != null) {
            object = last.element;
            last = last.prev;
        }
        return (E) object;
    }
    @Override
    public E get(int index) {
        return getElement();
    }
    @Override
    public Iterator<E> iterator() {
        return new IteratorList(last, first);
    }
}
