package List;

/**
 * Created by admin on 09.06.2017.
 */
public class Queue<E> extends ContainerLinkedList<E> {

    public E getElement() {
        Object object = null;

        if (first != null) {
            object = first.element;
            first = first.next;
        }
        return (E) object;
    }
    @Override
    public E get(int index) {
        return getElement();
    }

}
