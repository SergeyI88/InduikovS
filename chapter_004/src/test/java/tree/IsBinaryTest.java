package tree;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 14.07.2017.
 */
public class IsBinaryTest {
    @Test
    public void Test() {
        Tree<Integer> tree = new Tree<>();
        tree.add(1, 10);
        tree.add(1, 20);
        tree.add(10, 33);
        tree.add(10, 32);
        tree.add(20, 21);
        tree.add(20, 22);
        Assert.assertTrue(tree.isBinary());
        tree.add(22, 222);
        Assert.assertFalse(tree.isBinary());
        tree.add(22, 223);
        Assert.assertTrue(tree.isBinary());
    }
}
