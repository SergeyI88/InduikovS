package Iterator;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 27.05.2017.
 */
public class IteratorArrayNumbersTest {
    @Test
    public void searchNumbers() {
        int[] a = {54, 434, 32, 5, 11, 13, 17, 19, 192, 7, 74, 28, 9, 13};
        IteratorArrayNumbers iteratorArrayNumbers = new IteratorArrayNumbers(a);
        Assert.assertThat(5, Is.is(iteratorArrayNumbers.next()));
        Assert.assertThat(11, Is.is(iteratorArrayNumbers.next()));
        Assert.assertThat(13, Is.is(iteratorArrayNumbers.next()));
        Assert.assertThat(17, Is.is(iteratorArrayNumbers.next()));
        Assert.assertThat(19, Is.is(iteratorArrayNumbers.next()));
        Assert.assertThat(7, Is.is(iteratorArrayNumbers.next()));
        Assert.assertThat(13, Is.is(iteratorArrayNumbers.next()));
    }
}
