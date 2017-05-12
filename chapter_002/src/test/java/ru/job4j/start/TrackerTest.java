package ru.job4j.start;

import ru.job4j.models.Item;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* TrackerTest.
*/

public class TrackerTest {
/**
* Test.
*/
@Test
public void testAdd() {
 Tracker tracker = new Tracker();
 Item item = new Item("1", "test1", "testDescription", 123L);
 tracker.add(item);
 assertThat(tracker.findAll().get(0), is(item));
}
/**
* Test.
*/
@Test
public void testDelete() {
 Tracker tracker = new Tracker();
 Item item = new Item("2", "test2", "testDescription", 123L);
 tracker.add(item);
 tracker.delete(item);
 Item it = null;
 assertThat(tracker.getAll().get(0), is(it));
}
/**
* Test.
*/
@Test
public void testUpdate() {
 Tracker tracker = new Tracker();
 Item item = new Item("1", "test3", "testDescription", 123L);
 Item it = new Item("1", "test3.1", "testDesc", 124L);
 tracker.add(item);
 tracker.update(it);
 assertThat(tracker.findAll().get(0), is(it));
}
/**
* Test.
*/
@Test
public void testFindByID() {
 Tracker tracker = new Tracker();
 Item item = new Item("1", "test4", "testDescription", 123L);
 tracker.add(item);
 assertThat(tracker.findAll().get(0), is(tracker.findById("1")));
}
/**
* Test.
*/
@Test
public void testFindByName() {
 Tracker tracker = new Tracker();
 Item item1 = new Item("1", "test5", "testDescription", 123L);
 Item item2 = new Item("2", "test5", "testDes", 11L);
 ArrayList<Item> items1 = new ArrayList<>();
 items1.add(item1);
 items1.add(item2);
 tracker.add(item1);
 tracker.add(item2);
 assertThat(items1, is(tracker.findByName("test5")));
}

}