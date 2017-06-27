package List;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by admin on 27.06.2017.
 */
public class QeueTest {

    @Test
    public void whenAddEndGetOfStack() {
        Queue<Integer> queue = new Queue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        Assert.assertThat(10, Is.is(queue.getElement()));
    }

    @Test
    public void whenUsedIterator() {
        Queue<Integer> queue = new Queue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        Iterator<Integer> iterator = queue.iterator();
        Assert.assertThat(10, Is.is(iterator.next()));
        iterator.next();
        iterator.next();
        iterator.next();
        Assert.assertFalse(iterator.hasNext());
    }
}
