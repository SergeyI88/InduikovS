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
	return first > second ? first : second;
	}
/**
* Method max.
* @param first первый аргумент
* @param second второй аргумент
* @param third третий аргумент
* @return maximum
*/
public int max(int first, int second, int third) {
	return max((max(first, second)), third);
}
}