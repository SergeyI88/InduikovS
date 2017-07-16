package tree;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by admin on 15.07.2017.
 */
public class SearchBinaryTreeTest {
    @Test
    public void whenUseMethodAdd() {
        SearchBinaryTree<Integer> tree = new SearchBinaryTree<>();
        tree.add(10);
        tree.add(9);
        tree.add(8);
        tree.add(5);
        tree.add(6);
        tree.add(6);
        tree.add(4);
        tree.add(1);
        tree.add(3);
        tree.add(2);
        tree.add(15);
        tree.add(17);
        tree.add(16);
        Assert.assertThat(2, Is.is(tree.node.left.left.left.left.left.right.left.value));
        Assert.assertThat(9, Is.is(tree.node.left.value));
        Assert.assertThat(16, Is.is(tree.node.right.right.left.value));
    }
    @Test
    public void whenUseIterator() {
        SearchBinaryTree<Integer> tree = new SearchBinaryTree<>();
        tree.add(9);
        tree.add(8);
        tree.add(7);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(1);
        tree.add(3);
        tree.add(2);
        tree.add(10);
        tree.add(12);
        tree.add(11);
        Iterator<Integer> iterator = tree.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            Assert.assertThat(i++, Is.is(iterator.next()));
        }
    }
}
