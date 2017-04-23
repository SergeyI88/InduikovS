package ru.job4j.start;

import ru.job4j.models.Item;
import org.junit.Test;

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
 Input input = new StubInput(new String[]{"0", "test name", "test id", "desc", "0", "6"});   //создаём StubInput с последовательностью действий
 new StartUi(input, tracker).init();     //   создаём StartUI и вызываем метод init()
 assertThat(tracker.getAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
}
/**
* Test.
*/
@Test
public void testDelete() {
 Tracker tracker = new Tracker();
 Input input = new StubInput(new String[]{"3", "test id", "test id", "desc", "0", "6"});
 new StartUi(input, tracker).init();
 Item it = null;
 assertThat(tracker.getAll()[0], is(it));
}
/**
* Test.
*/
@Test
public void testUpdate() {
		Tracker tracker = new Tracker();
		Item it = new Item("test id", "test id", "testDesc", 124);
		tracker.add(it);
		Input input = new StubInput(new String[]{"2", "test id", "test id", "desc", "0", "6"});
		new StartUi(input, tracker).init();
		assertThat(tracker.findAll()[0].getCreate(), is(0L));
}
/**
* Test.
*/
@Test
public void testFindById() {
	Tracker tracker = new Tracker();
		Item result = null;
		tracker.add(new Item("test id", "test name", "testDescription", 123L));
		Input input = new StubInput(new String[] {"4", "test name", "test id", "desc", "0", "6"});
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
		Item[] result = new Item[1];
		tracker.add(new Item("test name", "test name", "testDescription", 123L));
		Input input = new StubInput(new String[] {"5", "test name", "test name", "desc", "0", "6"});
		new StartUi(input, tracker).init();
		result[0] = tracker.findByName("test name")[0];
		assertThat(result[0].getName(), is("test name"));
}
}