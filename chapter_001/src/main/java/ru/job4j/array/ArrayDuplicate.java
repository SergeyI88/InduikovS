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
	int end = array.length;
	for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (array[i] == array[j]) {
						array[j--] = array[--end];
				}
			}
		}
	return Arrays.copyOf(array, end);
	// возвращаем массив обрезанный копиями, которые остались справа
	}
/**
* Method remove1.
* @param array первый аргумент
* @return array
*/
	public int[] remove1(int[] array) {
		int end = array.length;
		for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (array[i] == array[j]) {
						array[j--] = array[--end];
				}
			}
		}
	return Arrays.copyOf(array, end);
	// возвращаем массив обрезанный копиями, которые остались справа
	}
}