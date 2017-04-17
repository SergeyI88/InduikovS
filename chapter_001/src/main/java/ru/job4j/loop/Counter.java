package ru.job4j.loop;

/**
* Counter.
*
* @author Sergey Indyukov (onl.ont@mail.ru)
* @version $Id$
* @since 0.1
*/

public class Counter {
/** Method area.
* @param start первый аргумент
* @param finish второй аргумент
* @return sum
*/
public int add(int start, int finish) {
		int sum = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
			sum += i;
			}
		}
		return sum;
	}
}