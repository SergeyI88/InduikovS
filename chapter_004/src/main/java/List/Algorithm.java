package List;

/**
 * Created by admin on 10.06.2017.
 */
public class Algorithm {
    public static void main(String[] args) {
        Node first = new Node(1);
        Node two = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        first.next = two;
        two.next = third;
        third.next = four;
        four.next = first;
        System.out.println(new Algorithm().hasCycle(first));
    }
    protected static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    boolean hasCycle(Node first) {
        Node node = first.next;
        while (node != null && node != first) {
            node = node.next;
        }
        if (node == first) {
            return true;
        } else {
            return false;
        }
    }
}
