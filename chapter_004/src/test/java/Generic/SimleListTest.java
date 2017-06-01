package Generic;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 01.06.2017.
 */
public class SimleListTest {
    @Test
    public void whenAddtoSimpleList() {
        SimpleList<Integer> simpleList = new SimpleList<>(5);
        simpleList.add(1);
        simpleList.add(2);
        simpleList.add(3);
        simpleList.add(4);
        simpleList.add(5);
        simpleList.add(6);
        Assert.assertThat(6, Is.is(simpleList.get(5)));
    }

    @Test
    public void whenDeletetoSimpleList() {
        SimpleList<Integer> simpleList = new SimpleList<>(5);
        simpleList.add(1);
        simpleList.add(2);
        simpleList.add(3);
        simpleList.add(4);
        simpleList.add(5);
        simpleList.add(6);
        simpleList.delete(1);

        Assert.assertThat(2, Is.is(simpleList.get(0)));
    }

    @Test
    public void whenUpdatetoSimpleList() {
        SimpleList<TestObject> simpleList = new SimpleList<>(5);
        simpleList.add(new TestObject("d", 154541));
        simpleList.add(new TestObject("dfd", 14341));
        simpleList.add(new TestObject("dfdcx", 1541));
        simpleList.add(new TestObject("fdfd", 54));
        simpleList.add(new TestObject("dcxc", 1143));
        simpleList.add(new TestObject("cxcfdfd", 1132));
        simpleList.update(new TestObject("d", 11));
        Assert.assertThat(11, Is.is(simpleList.get(0).getAge()));
    }
}
