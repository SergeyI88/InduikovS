package ru.job4j.max;
/**
* Max.
*
* @author Sergey Indyukov (onl.ont@mail.ru)
* @version $Id$
* @since 0.1
*/
public class Max {
/**
* Method max.
* @param first первый аргумент
* @param second второй аргумент
* @return maximum
*/
	public int max(int first, int second) {
/**
* @param maximum
*/
		int maximum;
		max = first > second ? first : second;
		return maximum;
	}
}
