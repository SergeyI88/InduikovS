package ru.job4j.loop;

/**
* Factorial.
*
* @author Sergey Indyukov (onl.ont@mail.ru)
* @version $Id$
* @since 0.1
*/
public class Factorial {
/** Method area.
* @param n первый аргумент
* @return sum
*/
	public int calc(int n) {
		int mul;
		if (n <= 0) {
			mul = 1;
			return mul;
		} else {
			for (int i = 1; i <= n; i++) {
				mul *= i;
			}
			return mul;
		}
	}
}