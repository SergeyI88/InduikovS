package threads.lists;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import threads.practice.User;

import java.util.Iterator;

import static org.junit.Assert.*;

public class ThreadSafeArrayListTest {
    @Test
    public void add() throws Exception {
        ThreadSafeArrayList<Integer> list = new ThreadSafeArrayList<>();
        list.add(1);
        Assert.assertThat(1, Is.is(list.objects[0]));
    }

    @Test
    public void edit() throws Exception {
        ThreadSafeArrayList<User> list = new ThreadSafeArrayList<>();
        list.add(new User(1, 10));
        list.edit(new User(1, 20));
        Assert.assertThat(20, Is.is(((User) list.objects[0]).amount));
    }

    @Test
    public void delete() throws Exception {
        ThreadSafeArrayList<Integer> list = new ThreadSafeArrayList<>();
        list.add(1);
        list.delete(1);
        Assert.assertNull(list.objects[0]);
    }

    @Test
    public void iterator() throws Exception {
        ThreadSafeArrayList <Integer> list = new ThreadSafeArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        Assert.assertThat(1, Is.is(iterator.next()));
        Assert.assertThat(2, Is.is(iterator.next()));
        Assert.assertThat(3, Is.is(iterator.next()));
        Assert.assertFalse(iterator.hasNext());
    }
}