package Iterator;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.text.html.HTMLDocument;

/**
 * Created by admin on 24.05.2017.
 */
public class IteratorArrayTest {
    @Test
    public void whenArrayHasRowsAndColls() {
        Integer[][] a = {{1, 2}, {3, 4}};
        ArrayIterator arrayIterator  = new ArrayIterator(a);
        arrayIterator.next();
        Assert.assertThat(2, Is.is(arrayIterator.next()));
        arrayIterator.next();
        arrayIterator.next();
        Assert.assertThat(false, Is.is(arrayIterator.hasNext()));
    }
}
