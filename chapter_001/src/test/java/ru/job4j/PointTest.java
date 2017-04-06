package ru.job4j.calculator;

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
public class PointTest {
/**
* Test add.
*/
@Test
public void trueOrFalse() {
        Point point = new Point(2, 5);
        boolean i = point.is(1, 3);
        boolean expected = true;
        assertThat(maximum, is(expected));
    }
}