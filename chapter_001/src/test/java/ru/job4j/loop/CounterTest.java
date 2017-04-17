package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Sergey Indyukov (mailto:onl.ont@mail.ri)
* @version $Id$
* @since 0.1
*/
public class CounterTest {
/**
* Test add.
*/
@Test
public void countingTheAmount() {
        Counter amount = new Counter();
        int sum = amount.add(1, 10);
        int expected = 30;
        assertThat(sum, is(expected));
    }
}