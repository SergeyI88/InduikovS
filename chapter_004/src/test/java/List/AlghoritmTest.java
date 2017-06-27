package List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 27.06.2017.
 */
public class AlghoritmTest {
    @Test
    public void determinationOfALoopList() {
        Algorithm algorithm = new Algorithm();
        Algorithm.Node first = new Algorithm.Node(1);
        Algorithm.Node two = new Algorithm.Node(2);
        Algorithm.Node third = new Algorithm.Node(3);
        Algorithm.Node four = new Algorithm.Node(4);
        first.next = two;
        two.next = third;
        third.next = four;
        four.next = first;
        Assert.assertTrue(algorithm.hasCycle(first));
    }
    public void determinationOfALoopList2() {
        Algorithm algorithm = new Algorithm();
        Algorithm.Node first = new Algorithm.Node(1);
        Algorithm.Node two = new Algorithm.Node(2);
        Algorithm.Node third = new Algorithm.Node(3);
        Algorithm.Node four = new Algorithm.Node(4);
        first.next = two;
        two.next = third;
        third.next = four;
        four.next = null;
        Assert.assertFalse(algorithm.hasCycle(first));
    }
}
