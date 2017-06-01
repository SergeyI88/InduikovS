package List;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.IntSummaryStatistics;
import java.util.Iterator;

/**
 * Created by admin on 01.06.2017.
 */
public class ContainerArrayListTest {
    @Test
    public void whenAddToContainerArrayList() {
        ContainerArrayList<Integer> containerArrayList = new ContainerArrayList<>(2);
        containerArrayList.add(2);
        containerArrayList.add(3);
        containerArrayList.add(4);
        containerArrayList.add(5);
        Assert.assertThat(5, Is.is(containerArrayList.get(3)));
    }
    @Test
    public void whenUseIterator() {
        ContainerArrayList<Integer> containerArrayList = new ContainerArrayList<>(2);
        containerArrayList.add(2);
        containerArrayList.add(3);
        containerArrayList.add(4);
        containerArrayList.add(5);
        Iterator<Integer> iterator = containerArrayList.iterator();
        Assert.assertThat(2, Is.is(iterator.next()));
        Assert.assertThat(3, Is.is(iterator.next()));
        Assert.assertThat(4, Is.is(iterator.next()));
    }

}
