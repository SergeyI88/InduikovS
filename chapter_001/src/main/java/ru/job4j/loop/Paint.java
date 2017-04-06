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
		for (int i = 0; i < h; i++) {
			for (int j = 1; j < h - 1; j++) {
					System.out.print(" ");
			}
			for (int k = i; k < h; k++) {
				System.out.print("^");
			}
		System.out.println();
		}
	}
}
