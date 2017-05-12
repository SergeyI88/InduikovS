package ru.job4j.start;

import ru.job4j.models.Item;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* TrackerTest.
*/

public class StubInputTest {
/**
* Test.
*/
@Test
public void addTest() {
 Tracker tracker = new Tracker();     // создаём Tracker
 Input input = new StubInput(new ArrayList<String>(Arrays.asList("0", "test name", "test id", "desc", "0", "6")));   //создаём StubInput с последовательностью действий
 new StartUi(input, tracker).init();     //   создаём StartUI и вызываем метод init()
 assertThat(tracker.getAll().get(0).getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
}
/**
* Test.
*/
@Test
public void testDelete() {
 Tracker tracker = new Tracker();
 tracker.add(new Item("test id", "test id", "testDesc", 124));
 Input input = new StubInput(new ArrayList<String>(Arrays.asList("3", "test name", "test id", "desc", "0", "6")));
 new StartUi(input, tracker).init();
 Item it = null;
 assertThat(tracker.getAll().get(0), is(it));
}
/**
* Test.
*/
@Test
public void testUpdate() {
		Tracker tracker = new Tracker();
		Item it = new Item("test id", "test id", "testDesc", 124);
		tracker.add(it);
		Input input = new StubInput(new ArrayList<String>(Arrays.asList("2", "test name", "test id", "desc", "0", "6")));
		new StartUi(input, tracker).init();
		assertThat(tracker.findAll().get(0).getCreate(), is(0L));
}
/**
* Test.
*/
@Test
public void testFindById() {
	Tracker tracker = new Tracker();
		Item result = null;
		tracker.add(new Item("test id", "test name", "testDescription", 123L));
		Input input = new StubInput(new ArrayList<String>(Arrays.asList("4", "test name", "test id", "desc", "0", "6")));
		new StartUi(input, tracker).init();
		result = tracker.findById("test id");
		assertThat(result.getId(), is("test id"));
}
/**
* Test.
*/
@Test
public void testFindByName() {
 Tracker tracker = new Tracker();
		ArrayList<Item> result = new ArrayList<>();
		tracker.add(new Item("test name", "test name", "testDescription", 123L));
		Input input = new StubInput(new ArrayList<String>(Arrays.asList("5", "test name", "test id", "desc", "0", "6")));
		new StartUi(input, tracker).init();
		result.add(tracker.findByName("test name").get(0));
		assertThat(result.get(0).getName(), is("test name"));
}
}