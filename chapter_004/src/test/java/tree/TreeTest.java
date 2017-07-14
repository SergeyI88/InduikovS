package tree;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by admin on 13.07.2017.
 */
public class TreeTest {
    @Test
    public void testAdd() {
        Tree<Integer> tree = new Tree<>();
        Assert.assertTrue(tree.add(1, 10 ));
        Assert.assertTrue(tree.add(1, 20));
        Assert.assertTrue(tree.add(20, 220));
        Assert.assertTrue(tree.add(10, 545));

        Assert.assertFalse(tree.add(2, 20));

        Assert.assertTrue(tree.add(545, 111));
        Assert.assertTrue(tree.add(111, 214));
        Assert.assertTrue(tree.add(10, 99));

        Assert.assertFalse(tree.add(1220, 99));
    }

    @Test
    public void testUseIterator() {
        Tree<Integer> tree = new Tree<>();
        Assert.assertTrue(tree.add(1, 10 ));
        Assert.assertTrue(tree.add(1, 20));
        Assert.assertTrue(tree.add(20, 220));
        Assert.assertTrue(tree.add(10, 545));

        Assert.assertFalse(tree.add(2, 20));

        Assert.assertTrue(tree.add(545, 111));
        Assert.assertTrue(tree.add(111, 214));
        Assert.assertTrue(tree.add(10, 99));

        Assert.assertFalse(tree.add(1220, 99));
        Iterator<Integer> iterator = tree.iterator();
        Assert.assertThat(1, Is.is(iterator.next()));
        Assert.assertThat(10, Is.is(iterator.next()));
        Assert.assertThat(20, Is.is(iterator.next()));
        Assert.assertThat(545, Is.is(iterator.next()));
        Assert.assertThat(99, Is.is(iterator.next()));
    }
}
