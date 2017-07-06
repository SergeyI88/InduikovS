package List;

import java.util.HashSet;

/**
 * Created by admin on 10.06.2017.
 */
public class Algorithm {
    protected static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    boolean hasCycle(Node first) {
        HashSet<Node> set = new HashSet<>();

        Node node = first.next;
        set.add(first);
        while (set.add(node)) {
            if (node.next == null) {
                return false;
            }
            node = node.next;
        }
        return true;
    }
}
