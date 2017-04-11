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
public class ArrayDuplicateTest {
/**
* Test  whenRemoveDuplicatesThenArrayWithoutDuplicate.
*/
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		ArrayDuplicate obj = new ArrayDuplicate();
		String[] string1 = new String[] {"privet", "mir", "privet", "super", "mir"};
		String[] expectArray = new String[] {"privet", "mir", "super"};
		String[] resultArray = obj.remove(string1);
		assertThat(resultArray, is(expectArray));
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }
/**
* Test  whenRemoveNumbers.
*/
    @Test
    public void whenRemoveNumbers() {
		ArrayDuplicate obj = new ArrayDuplicate();
		int[] string = new int[] {3, 6, 1, 6, 1, 6, 1, 2};
		int[] expectArray = new int[] {3, 6, 1, 2};
		int[] resultArray = obj.remove1(string);
		assertThat(resultArray, is(expectArray));
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }
}