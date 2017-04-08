package ru.job4j.array;
/**
* BubleSort.
*
* @author Sergey Indyukov (onl.ont@mail.ru)
* @version $Id$
* @since 0.1
*/
public class BubleSort {
/**
* Method sirt.
* @param array первый аргумент
* @return array
*/
	public int[] sort(int[] array) {
		int temp = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - i - 1; j++) {
					if (array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		return array;
	}
}