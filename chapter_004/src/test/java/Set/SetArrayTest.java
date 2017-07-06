package Set;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 27.06.2017.
 */
public class SetArrayTest {
    @Test
    public void whenTryAdd() {
        SimpleSetArray simpleSetArray = new SimpleSetArray();
        simpleSetArray.add(10);
        simpleSetArray.add(10);
        simpleSetArray.add(20);
        simpleSetArray.add(20);
        Assert.assertThat(2, Is.is(simpleSetArray.size()));
    }
}
