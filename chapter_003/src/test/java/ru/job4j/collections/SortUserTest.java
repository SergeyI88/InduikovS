package ru.job4j.collections;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by admin on 12.05.2017.
 */
public class SortUserTest {
    @Test
    public void sortTest() {
        List<User2> list = new ArrayList<>(Arrays.asList(new User2("name", 23), new User2("nick", 19), new User2("agur3", 29)));
        TreeSet<User2> treeSet = (TreeSet<User2>) new SortUser().sort(list);
        Iterator<User2> iterator = treeSet.iterator();
        User2 user = iterator.next();
        iterator.next();
        User2 user2 = iterator.next();
        assertThat(user.toString(), is(new User2("nick", 19).toString()));
        assertThat(user2.toString(), is(new User2("agur3", 29).toString()));
    }
    @Test
    public void sortTestHash() {
        List<User2> list = new ArrayList<>(Arrays.asList(new User2("name", 23), new User2("nick", 19), new User2("agur3", 29)));
        List<User2> list1 =  new SortUser().sortHash(list);
        Iterator<User2> iterator = list1.iterator();
        User2 user = iterator.next();
        iterator.next();
        User2 user2 = iterator.next();
        assertThat(user.hashCode(), is(23));
        assertThat(user2.toString(), is(new User2("agur3", 29).toString()));
    }
    @Test
    public void sortTestLength() {
        List<User2> list = new ArrayList<>(Arrays.asList(new User2("nicolos", 23), new User2("nicki", 19), new User2("agur3", 29)));
        List<User2> list1 =  new SortUser().sortLength(list);
        Iterator<User2> iterator = list1.iterator();
        User2 user = iterator.next();
        iterator.next();
        User2 user2 = iterator.next();
        assertThat(user.getName().length(), is(5));
        assertThat(user2.toString(), is(new User2("nicolos", 23).toString()));
    }

}
