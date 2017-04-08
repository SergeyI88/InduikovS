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
public class BubleSortTest {
/**
* Test  whenSortArrayWithTenElementsThenSortedArray.
*/
    @Test
    public void  whenSortArrayWithTenElementsThenSortedArray() {
		BubleSort buble = new BubleSort();
		int[] expectArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] tempArray = new int[] {4, 1, 6, 2, 5, 3, 9, 0, 8, 7};
		int[] resultArray = buble.sort(tempArray);
		assertThat(resultArray, is(expectArray));
    }
}