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
		int c1 = 0;
		int c = 0;		//переменная счетчик количество повторяемых слов
		for (int i = 0; i < array.length - c1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					for (int k = j; k < array.length - 1; k++) {
						array[k] = array[k + 1];
					}
					c1++;
					if (array[i] == array[j]) {
						i--;
						c--;
					}
				}
			}
		}
			c += c1;
		return Arrays.copyOf(array, array.length - c - 1);
	// возвращаем массив обрезанный копиями, которые остались справа
	}
/**
* Method remove1.
* @param array первый аргумент
* @return array
*/
	public int[] remove1(int[] array) {
		int c1 = 0;
		int c = 0;		//переменная счетчик количество повторяемых слов
		for (int i = 0; i < array.length - c1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					for (int k = j; k < array.length - 1; k++) {
						array[k] = array[k + 1];
					}
					c1++;
					if (array[i] == array[j]) {
						i--;
						c--;
					}
				}
			}
		}
		c += c1;
	return Arrays.copyOf(array, array.length - c - 1);
	// возвращаем массив обрезанный копиями, которые остались справа
	}
}