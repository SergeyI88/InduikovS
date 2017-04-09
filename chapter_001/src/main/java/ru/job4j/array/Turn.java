package ru.job4j.array;

/**
* Turn.
*
* @author Sergey Indyukov (onl.ont@mail.ru)
* @version $Id$
* @since 0.1
*/
public class Turn {
	//private int[] array1 = new int[] {1, 2, 3, 4, 5};
	//private int[] array2 = new int[] {2, 6, 1, 4};
/**
* Method back.
* @param array первый аргумент
* @return array
*/
	public int[] back(int[] array) {
		int temp = 0;
		//if (array.length % 2 == 0) {
			for (int i = 0; i < array.length / 2; i++) {
				temp = array[i];
				array[i] = array[array.length - 1 - i];
				array[array.length - i - 1] = temp;
			}
		/*} else {
			for (int i = 1; i < array.length / 2 + 1; i++) {
				temp = array[i - 1];
				array[i - 1] = array[array.length  - i];
				array[array.length - i] = temp;
			}
		}*/
		return array;
	}
}