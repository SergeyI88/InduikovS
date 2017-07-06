package Set;



import org.hamcrest.core.Is;
import org.junit.*;

public class SimpleLinkedSetTest {

    @Test
    public void whenAddAndUseIteratorInCollection() {
        SimpleLinkedSet set = new SimpleLinkedSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        Assert.assertFalse(set.add(4));
        Assert.assertTrue(set.hasNext());
        Assert.assertThat(1, Is.is(set.next()));
        set.next();
        set.next();
        set.next();
        Assert.assertFalse(set.hasNext());
    }
}
