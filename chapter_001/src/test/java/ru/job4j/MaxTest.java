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

public class MaxTest {
/**
* Test add.
*/
@Test
public void returnFirsOrSecond() {
        Max M = new Max();
        M.max(2, 1);
        int maximum = 2;
        int expected = 2;
        assertThat(maximum, is(expected));
    }