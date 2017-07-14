package tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class Tree
 *
 * @author Sergey
 * @param <E> parametrized type
 */
public class Tree<E extends Comparable<E>> implements SimpleTree<E> {
    /**
     *
     * @param <E> parametrized type
     */
    class Node<E> {
        /**
         * @param childen for storage nodes
         */
        List<Node<E>> childen;
        /**
         * @param value which storage in nodes
         */
        E value;

        /**
         * Constructor Node
         * @param parent take value
         */
        public Node(E parent) {
            childen = new ArrayList<>();
            nodeForSearchParent = node;
            value = parent;
        }

        /**
         * For output in console
         * @return
         */
        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * @param node this root it tree.
     */
    Node<E> node;
    /**
     * @param nodeForSearchParent need for search coincidence key and the alleged value
     */
    Node<E> nodeForSearchParent;

    /**
     * add new node int tree, if @parent equals one of the elements in tree
     * @param parent parent search key
     * @param child child add value
     * @return
     */
    @Override
    public boolean add(E parent, E child) {
        boolean result = false;
        if (node == null) {
            node = new Node<>(parent);
            node.childen.add(new Node<E>(child));
            result = true;
        } else {
            if (parent.compareTo(nodeForSearchParent.value) == 0) {
                nodeForSearchParent.childen.add(new Node<E>(child));
                result = true;
            } else {
                for (Node<E> n : nodeForSearchParent.childen) {
                    if (n.value.compareTo(parent) == 0) {
                        n.childen.add(new Node<>(child));
                        result = true;
                    }
                }
                if (!result) {
                    for (Node<E> n : nodeForSearchParent.childen) {
                        if (!n.childen.isEmpty()) {
                            nodeForSearchParent = n;
                            if (add(parent, child)) {
                                result = true;
                                break;
                            }
                        }
                    }
                }

            }
        }
        if (!result) {
            nodeForSearchParent = node;
        }
        return result;
    }

    /**
     * Method for implements Iterator in tree
     * @return iterator
     */
    @Override
    public Iterator<E> iterator() {
        return new TreeIterator<>(node);
    }
    /**
     * Class for implements Iterator in tree
     */
    private class TreeIterator<E> implements Iterator<E> {
        /**
         * Take root
         * @param node
         */
        Node<E> node;
        /**
         * Take list
         */
        List<Node<E>> list;
        /**
         * For iterator paths
         * @param index
         */
        int index = 0;

        /**
         * Need for iterator
         * @return list - Generated of tree
         */
        public List<Node<E>> methodGenerateListOfTreeForIterator() {
            if (list.isEmpty()) {
                list.add(node);
                list.addAll(node.childen);
            }
            for (Node n : this.node.childen) {
                if (!n.childen.isEmpty()) {
                    list.addAll(n.childen);
                    node = n;
                    methodGenerateListOfTreeForIterator();
                }
            }
            return list;
        }

        /**
         * Constructor TreeIterator
         * @param node
         */
        public TreeIterator(Node<E> node) {
            this.node = node;
            list = new ArrayList<>();
            list = methodGenerateListOfTreeForIterator();
        }

        /**
         * Checks have tree elements, which could return
         * @return
         */
        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        /**
         * Return next element
         * @return
         */
        @Override
        public E next() {
            return list.get(index++).value;
        }

        /**
         * Remove currency element, which look index
         */
        @Override
        public void remove() {

        }
    }
}

