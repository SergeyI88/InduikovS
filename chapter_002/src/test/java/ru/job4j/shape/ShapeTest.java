package ru.job4j.shape;

import org.junit.Test;
import ru.job4j.paint.Paint;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Sergey Indyukov
* @version $Id$
* @since 0.1
*/

public class ShapeTest {
/**
* Test testSquare.
*/
    @Test
    public void testSquare() {
		new Paint().draw(new Square());
        String result = new Square().pic();
        String expected = String.format("&&&\r\n&&&\r\n&&&\r\n");
        assertThat(result, is(expected));
    }
/**
* Test testTriangle.
*/
    @Test
    public void testTriangle() {
		new Paint().draw(new Triangle());
		String result = new Triangle().pic();
        String expected = String.format("  ^  \r\n ^^^ \r\n^^^^^");
        assertThat(result, is(expected));
    }
}