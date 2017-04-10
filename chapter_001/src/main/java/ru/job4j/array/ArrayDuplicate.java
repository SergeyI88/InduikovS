package ru.job4j.array;
import java.util.Arrays;
/**
* RotateArray.
*
* @author Sergey Indyukov (onl.ont@mail.ru)
* @version $Id$
* @since 0.1
*/
public class ArrayDuplicate {
/**
* Method remove.
* @param array первый аргумент
* @return array
*/
	public int[] remove(String[] array) {
		int c = 0; //переменная счетчик количество повторяемых слов
			for (int i = 0; i < array.length / 2; i++) {
				for (int j = 1; i < array.length; j++) {
					if (array[i] == array[j]) {
						for (int k = j; k < array.length - 1; k++) {
							array[k] = array[k + 1];
						}
						c++;
						j--;
					}
				}
			}
		return Arrays.copyOf(array, array.length - c);
	} //{"Привет", "Мир", "Привет", "Супер", "Мир"};
}