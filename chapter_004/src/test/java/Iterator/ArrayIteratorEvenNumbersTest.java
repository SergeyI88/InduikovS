package Iterator;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 27.05.2017.
 */
public class ArrayIteratorEvenNumbersTest {
    @Test
    public void checkForEvenNumbers() {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 17, 132, 193, 222, 233, 445, 997, 455, 808};
        IteratorArray iteratorArray = new IteratorArray(a);
        iteratorArray.next();
        Assert.assertThat(2, Is.is(iteratorArray.next()));
        Assert.assertThat(4, Is.is(iteratorArray.next()));
        Assert.assertThat(6, Is.is(iteratorArray.next()));
        Assert.assertThat(8, Is.is(iteratorArray.next()));
    }
}
