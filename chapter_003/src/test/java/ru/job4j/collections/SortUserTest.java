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
        List<User2> list = new ArrayList<>(Arrays.asList(new User2("name", 23), new User2("name2", 19), new User2("name3", 29)));
        TreeSet<User2> treeSet = (TreeSet<User2>) new SortUser().sort(list);
        Iterator<User2> iterator = treeSet.iterator();
        User2 user = iterator.next();
        iterator.next();
        User2 user2 = iterator.next();
        assertThat(user.toString(), is(new User2("name2", 19).toString()));

        assertThat(user2.toString(), is(new User2("name3", 29).toString()));
    }

}
