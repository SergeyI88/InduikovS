package List;

/**
 * Created by admin on 27.06.2017.
 */
import org.hamcrest.core.Is;
import org.junit.*;

import java.util.Iterator;


public class StackTest {
    @Test
    public void whenAddEndGetOfStack() {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        Assert.assertThat(40, Is.is(stack.getElement()));
    }
    @Test
    public void whenUsedIterator() {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        Iterator<Integer> iterator = stack.iterator();
        Assert.assertThat(40, Is.is(iterator.next()));
    }
}
