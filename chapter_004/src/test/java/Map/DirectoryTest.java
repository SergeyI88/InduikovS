package Map;

import map.Directory;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by admin on 09.07.2017.
 */
public class DirectoryTest {
    @Test

    public void whenAddAndUseGetInDirectory() {
        Directory directory = new Directory();
        directory.insert(1, "1");
        directory.insert(2, "2");
        directory.insert(3, "3");
        directory.insert(4, "4");
        directory.insert(5, "5");
        directory.insert(6, "5");
        directory.insert(7, "5");
        directory.insert(8, "5");
        directory.insert(9, "5");
        directory.insert(10, "5");
        Assert.assertThat("5", Is.is(directory.get(10)));
    }
    @Test
    public void whenDelIndirectory() {
        Directory directory = new Directory();
        directory.insert(1, "1");
        directory.insert(2, "2");
        directory.insert(3, "3");
        directory.insert(4, "4");
        directory.insert(5, "5");
        directory.insert(6, "5");
        directory.insert(7, "5");
        directory.insert(8, "5");
        directory.insert(9, "5");
        directory.insert(10, "5");
        Assert.assertTrue(directory.delete(10));
        Assert.assertThat(null, Is.is(directory.get(10)));
    }

    @Test
    public void whenUseIteratorInDirectory() {
        Directory<Integer, String> directory = new Directory();
        directory.insert(1, "1");
        directory.insert(2, "2");
        directory.insert(3, "3");
        Iterator<Directory.Entry> iterator = directory.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertThat("1", Is.is(iterator.next().getValue()));
        iterator.next();
        iterator.next();
        Assert.assertFalse(iterator.hasNext());
    }
}
