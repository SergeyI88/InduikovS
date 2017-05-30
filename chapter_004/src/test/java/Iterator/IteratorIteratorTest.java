package Iterator;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by admin on 30.05.2017. commit task 152
 */
public class IteratorIteratorTest {
    @Test
    public void test() {
        Iterator<Integer> first = Arrays.asList(1, 2, 3).iterator();
        Iterator<Integer> second = Arrays.asList(4, 5, 6).iterator();
        Iterator<Iterator<Integer>> it = Arrays.asList(first, second).iterator();
        Iterator<Integer> iter = IteratorIterator.convert(it);
        Assert.assertThat(1, Is.is(iter.next()));
        iter.next();
        iter.next();
        iter.next();
        iter.next();
        iter.next();
        Assert.assertThat(false, Is.is(iter.hasNext()));
    }
}
