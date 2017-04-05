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

public class CalculatorTest {
/**
* Test add.
*/
@Test
public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
/**
* Test substruct.
*/
public void whenSubstructOneMinusOneThenZero() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }
/**
* Test div.
*/
public void whenDivOneDivOneThenOne() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
/**
* Test multiple.
*/
public void whenMultipleOneMultipleOneThenOne() {
Calculator calc = new Calculator();
calc.add(1D, 1D);
double result = calc.getResult();
double expected = 1D;
assertThat(result, is(expected));
}
}