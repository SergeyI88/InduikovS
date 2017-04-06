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

public class FactorialTest {
/**
* Test FactorialTest.
*/
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
		Factorial obj = new Factorial();
        int num = obj.calc(5);
        int expected = 120;
        assertThat(num, is(expected));
        //�������� ����� ����, �����������, ��� ��������� ��� ����� 5 ����� 120.
    }
/**
* Test whenCalculateFactorialForZeroThenOne.
*/
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
		Factorial obj = new Factorial();
        int num = obj.calc(0);
        int expected = 1;
        assertThat(num, is(expected));
        //�������� ����� ����, �����������, ��� ��������� ��� ����� 0 ����� 1.
    }
}