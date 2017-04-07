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

public class PaintTest {
/**
* Test whenPiramidWithHeightTwoThenStringWithTwoRows.
*/
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
/**
* Test whenPiramidWithHeightThreeThenStringWithThreeRows.
*/
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
		Paint paint = new Paint();
        String result = paint.piramid(3);
        String expected = String.format("  ^  %s ^^^ %s^^^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
       //напишите здесь тест, проверяющий формирование пирамиды для высоты 3.
    }
}