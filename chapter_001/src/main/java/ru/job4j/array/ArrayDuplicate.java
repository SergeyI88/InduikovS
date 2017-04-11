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
public String[] remove(String[] array) {
		int c1 = 0; //переменная счетчик количество повторяемых слов
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					array[j] = null;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				c1++;
			}
		}
		 	for (int i = 0; i < array.length - c1; i++) {
				if (array[i] == null) {
					for (int j = i + 1; j < array.length; j++) {
						array[j - 1] = array[j];
					}
					--i;
				}
			}
		return Arrays.copyOf(array, array.length - c1);
	// возвращаем массив обрезанный копиями, которые остались справа
	}
/**
* Method remove1.
* @param array первый аргумент
* @return array
*/
	public int[] remove1(int[] array) {
		int c1 = 0; //переменная счетчик количество повторяемых слов
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					array[j] = 0;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				c1++;
			}
		}
		 	for (int i = 0; i < array.length - c1; i++) {
				if (array[i] == 0) {
					for (int j = i + 1; j < array.length; j++) {
						array[j - 1] = array[j];
					}
					--i;
				}
			}
	return Arrays.copyOf(array, array.length - c1);
	// возвращаем массив обрезанный копиями, которые остались справа
	}
}