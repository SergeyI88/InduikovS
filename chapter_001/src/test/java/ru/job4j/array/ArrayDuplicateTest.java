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
		String[] string1 = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
		String[] expectArray = new String[] {"Привет", "Мир", "Супер"};
		String[] resultArray = obj.remove(string1);
		assertThat(resultArray, is(expectArray));
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }
}