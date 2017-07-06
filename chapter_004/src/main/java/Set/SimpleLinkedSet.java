package Set;

import java.util.Iterator;

public class SimpleLinkedSet<E> implements Iterator<E> {

    Node<E> first;
    Node<E> last;
    Node<E> nodeIterator = first;
    /**
     * @param variableForDeterminationItisPossibleReturnTrue - For Determination Of It is Possible Return true,
     * when  last == null, but need Return one Value for Iterator and for determination have in SET reviews.
     */
    boolean variableForDeterminationItisPossibleReturnTrue = true;

    public boolean add(E value) {
        if (checkForUniqueness(value)) {
            nodeIterator = first;
            if (first == null) {
                first = new Node<>(value);
                nodeIterator = first;
            } else if (last == null) {
                last = new Node<>(value);
                first.next = last;
                last.prev = first;
                nodeIterator = first;
            } else {
                Node<E> temp = last;
                last = new Node<>(value);
                last.prev = temp;
                temp.next = last;
                nodeIterator = first;
            }
            return true;
        }
        return false;
    }

    private boolean checkForUniqueness(E value) {
        if (first == null) {
            return true;
        }
        if (last == null) {
            return first.value.equals(value) ? false : true;
        }
        Node node = first;
        while (!(node == null)) {
            if (node.value.equals(value)) {
                return false;
            }
            node = node.next;
        }
        return true;
//        variableForDeterminationItisPossibleReturnTrue = true;
//        if (first == null) {
//            return true;
//        }
//        while (hasNext()) {
//            if (next().equals(value)) {
//                variableForDeterminationItisPossibleReturnTrue = true;
//                return false;
//            }
//        }
//        variableForDeterminationItisPossibleReturnTrue = true;
//        return true;
    }

    private class Node<E> {
        E value;
        Node<E> prev;
        Node<E> next;

        public Node(E value) {
            this.value = value;
        }

        public Node() {
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node<?> node = (Node<?>) o;

            return value != null ? value.equals(node.value) : node.value == null;
        }
    }

    @Override
    public boolean hasNext() {
        if (!(variableForDeterminationItisPossibleReturnTrue)) {
            return false;
        }
        if (first == null) {
            return false;
        }
        if (last == null) {
            return true;
        }
        return nodeIterator != null;
    }

    @Override
    public E next() {
        if (last == null) {
            variableForDeterminationItisPossibleReturnTrue = false;
            return first.value;
        }
        Node temp = nodeIterator;
        nodeIterator = nodeIterator.next;
        return (E) temp.value;

    }

    @Override
    public void remove() {

    }
}
