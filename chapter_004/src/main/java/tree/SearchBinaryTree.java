package tree;

import java.util.*;

/**
 * Class Tree
 *
 * @param <E> parametrized type
 * @author Sergey
 */
public class SearchBinaryTree<E extends Comparable<E>> implements Iterable<E> {
    /**
     * @param <E> parametrized type
     */
    class Node<E> {
        Node<E> left;
        Node<E> right;
        /**
         * @param value which storage in nodes
         */
        E value;

        /**
         * Constructor Node
         *
         * @param parent take value
         */
        public Node(E parent) {
            nodeForSearchParent = node;
            value = parent;
        }

        /**
         * For output in console
         *
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
     * Method add new node int tree
     *
     * @param e add element
     * @return
     */
    public boolean add(E e) {
        boolean result = false;
        if (result = node == null) {
            node = new Node<>(e);
            nodeForSearchParent = node;
        } else if (result = nodeForSearchParent.value.compareTo(e) == 0 || nodeForSearchParent.value.compareTo(e) > 0) {
            if (nodeForSearchParent.left == null) {
                nodeForSearchParent.left = new Node<>(e);
            } else {
                nodeForSearchParent = nodeForSearchParent.left;
                add(e);
            }
        } else if (result = nodeForSearchParent.value.compareTo(e) < 0) {
            if (nodeForSearchParent.right == null) {
                nodeForSearchParent.right = new Node<>(e);
            } else {
                nodeForSearchParent = nodeForSearchParent.right;
                add(e);
            }
        }
        return result;
    }

    /**
     * Method for implements Iterator in tree
     *
     * @return iterator
     */
    @Override
    public Iterator<E> iterator() {
        return new TreeIteratorForIsBinary<>(node);
    }

    /**
     * Class for implements Iterator in tree
     */
    private class TreeIteratorForIsBinary<E> implements Iterator<E> {

        private class NodeForIterator {
            List<Node<E>> listNodes;
            Node<E> left;
            Node<E> right;
            /**
             * @param value which storage in nodes
             */
            E value;

            /**
             * For output in console
             *
             * @return
             */
            @Override
            public String toString() {
                return String.valueOf(value);
            }
        }

        /**
         * @param root
         */
        private Node<E> root;
        /**
         * Take root
         *
         * @param node
         */
        Node<E> nodeForSearchParent;
        /**
         * Take list
         */
        List<E> list;
        /**
         * For iterator paths
         *
         * @param index
         */
        int index = 0;
        private List<List<Node<E>>> list1;

        /**
         * Constructor TreeIterator
         *
         * @param node
         */
        public TreeIteratorForIsBinary(Node<E> node) {
            this.nodeForSearchParent = node;
            root = node;
            list = new ArrayList<>();
            list = generatedListOfTreeForIterator(root);
        }

        /**
         * Method Generate List for Iterator of tree.
         *
         * @param root
         * @return
         */
        public List<E> generatedListOfTreeForIterator(Node<E> root) {
            if (root.left != null) {
                generatedListOfTreeForIterator(root.left);
            }
            list.add(root.value);
            if (root.right != null) {
                generatedListOfTreeForIterator(root.right);
            }
            return list;
        }

        /**
         * Checks have tree elements, which could return
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        /**
         * Return next element
         *
         * @return
         */
        @Override
        public E next() {
            return list.get(index++);
        }

        /**
         * Remove currency element, which look index
         */
        @Override
        public void remove() {

        }
    }
}

