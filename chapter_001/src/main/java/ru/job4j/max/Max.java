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
* @return maximum
*/
		int maximum;
		maximum = first > second ? first : second;
		return maximum;
	}
/**
* Method max.
* @param first первый аргумент
* @param second второй аргумент
* @param third третий аргумент
* @return maximum
*/
public int max(int first, int second, int third) {

	int max1;
	max1 = max(first, second);
	max1 = max(max1, third);
}
}