package ru.job4j.array;

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
public class SortTwoArraysTest {
/**
* Test sortTest.
*/
    @Test
	public void sortTest() {
		SortTwoArrays array = new SortTwoArrays();
		int[] expectArray = new int[] {1, 3, 7, 90, 231, 888, 889, 911};
		int[] tempArray1 = new int[] {1, 7, 888, 889};
		int[] tempArray2 = new int[] {3, 90, 231, 911};
		int[] resultArray = array.sort(tempArray1, tempArray2);
		assertThat(resultArray, is(expectArray));
	}
/**
* Test sortTest.
*/
    @Test
	public void sortTest1() {
		SortTwoArrays array = new SortTwoArrays();
		int[] expectArray = new int[] {1, 3, 7, 90, 231, 888, 889, 911};
		int[] tempArray1 = new int[] {1, 7, 231, 888, 889, 911};
		int[] tempArray2 = new int[] {3, 90};
		int[] resultArray = array.sort(tempArray1, tempArray2);
		assertThat(resultArray, is(expectArray));
	}
}