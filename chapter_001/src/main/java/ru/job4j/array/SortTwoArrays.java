package ru.job4j.array;

/**
* SortTwoArrays.
*
* @author Sergey Indyukov (onl.ont@mail.ru)
* @version $Id$
* @since 0.1
*/

public class SortTwoArrays {
/** Method piramid.
* @param a1 первый аргумент
* @param a2 второй аргумент
* @return int[] массив
*/
	public int[] sort(int[] a1, int[] a2) {
		int[] result = new int[a1.length + a2.length];
		int i = 0, j = 0, k = 0;
		//for (; i < a1.length && j < a2.length; k++) {
		while (i < a1.length && j < a2.length) {
			if (a1[i] <= a2[j]) {
				result[k++] = a1[i++];
			} else if (a2[j] < a1[i]) {
				result[k++] = a2[j++];
			}
		}
		if (i == a1.length - 1) {
				result[k++] = a1[i++];
			} else if (j == a2.length - 1) {
				result[k++] = a2[j++];
			}
		if (a1.length < a2.length) {
			while (j < a2.length) {
				result[k++] = a2[j++];
			}
		} else if (a1.length > a2.length) {
			while (i < a1.length) {
				result[k++] = a1[i++];
			}
		}
		return result;
	}
}
