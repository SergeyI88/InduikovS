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
		int sum;
		if (start % 2 == 0) {
			for (int i = start; i <= finish; i += 2) {
				sum += i;
			}
		} else {
			for (int i = start + 1; i <= finish; i += 2) {
				sum += i;
			}
		}
		return sum;
	}
}