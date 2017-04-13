package ru.job4j.array;
/**
* Search.
*
* @author Sergey Indyukov (onl.ont@mail.ru)
* @version $Id$
* @since 0.1
*/
public class Search {
/**
* Method contains.
* @param origin первый аргумент
* @param sub второй аргумент
* @return c
*/
public boolean contains(String origin, String sub) {
char[] orig = origin.toCharArray();
char[] s = sub.toCharArray();
int k = 1;
boolean c = false;
for (int i = 0, j = 0; i < orig.length; i++) {
	if (orig[i] == s[j]) {
		int gl = i;
		int pod = j;
		while (pod < s.length || gl < orig.length) {
			if (orig[gl++] == s[pod++]) {
				k++;
				if (k == s.length) {
					c = true;
				}
			} else {
				break;
			}
		}
	}
}
return c;
}
}





