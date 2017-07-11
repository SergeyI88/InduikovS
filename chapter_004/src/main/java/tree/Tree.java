package tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Tree<E extends Comparable<E>> implements SimpleTree<E> {

    class Node<E> {
        List<Node<E>> childen;
        E value;
    }

    Node<E> node;
    @Override
    public boolean add(E parent, E child) {
        Node<E> node = new Node<>();
        if (node.childen.isEmpty()) {
            node.value = parent;
            Node<E> nodeChild = new Node<>();
            nodeChild.value = child;
            node.childen.add(nodeChild);
            this.node = node;
            return true;
        } else {
            if (parent.compareTo(node.value) == 0) {
                Node<E> nodeChild = new Node<>();
                nodeChild.value = child;
                node.childen.add(nodeChild);
                return true;
            }
            return false;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}

