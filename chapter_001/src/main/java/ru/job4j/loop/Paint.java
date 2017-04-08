package ru.job4j.loop;

/**
* Paint.
*
* @author Sergey Indyukov (onl.ont@mail.ru)
* @version $Id$
* @since 0.1
*/
public class Paint {
/** Method piramid.
* @param h первый аргумент
* @return String что-то
*/
	public String piramid(int h) {
		StringBuilder sB = new StringBuilder();
		for (int i = 0; i < h; i++) {
			for (int j = i; j < h - 1; j++) {
				sB.append(' ');
			}
			for (int j = h - i; j <= h + i; j++) {
				sB.append('^');
			}
			for (int j = i; j < h - 1; j++) {
				sB.append(' ');
			}
			if (i < h - 1) {
				sB.append(System.getProperty("line.separator"));
			}
		}
		return sB.toString();
	}
}
