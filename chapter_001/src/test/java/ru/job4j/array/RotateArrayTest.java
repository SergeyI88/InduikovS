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
public class RotateArrayTest {
/**
* Test  whenRotateTwoRowTwoColArrayThenRotatedArray.
*/
    @Test
    public void  whenRotateTwoRowTwoColArrayThenRotatedArray() {
		RotateArray rA = new RotateArray();
		int[][] tempArray = new int[][] {{0, 1}, {2, 3}};
		int[][] expectArray = new int[][] {{2, 0}, {3, 1}};
		int[][] resultArray = rA.rotate(tempArray);
		assertThat(resultArray, is(expectArray));
    }
/**
* Test  whenRotateThreeRowThreeColArrayThenRotatedArray.
*/
    @Test
    public void  whenRotateThreeRowThreeColArrayThenRotatedArray() {
		RotateArray rA = new RotateArray();
		int[][] tempArray = new int[][] {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
		int[][] expectArray = new int[][] {{6, 3, 0}, {7, 4, 1}, {8, 5, 2}};
		int[][] resultArray = rA.rotate(tempArray);
		assertThat(resultArray, is(expectArray));
    }
}