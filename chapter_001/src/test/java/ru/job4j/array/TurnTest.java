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
public class TurnTest {
/**
* Test whenTurnArrayWithEvenAmountOfElementsThenTurnedArray.
*/
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] expectArray = new int[] {4, 1, 6, 2};
		int[] tempArray = new int[] {2, 6, 1, 4};
		int[] resultArray = turn.back(tempArray);
		assertThat(resultArray, is(expectArray));
        //напишите здесь тест, провер¤ющий переворот массива с чЄтным числом элементов, например {2, 6, 1, 4}.
    }
/**
* Test whenTurnArrayWithEvenAmountOfElementsThenTurnedArray.
*/
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] expectArray = new int[] {1, 2, 3, 4, 5};
		int[] tempArray = new int[] {5, 4, 3, 2, 1};
		int[] resultArray = turn.back(tempArray);
		assertThat(resultArray, is(expectArray));
        //напишите здесь тест, провер¤ющий переворот массива с нечЄтным числом элементов, например {1, 2, 3, 4, 5}.
    }
}