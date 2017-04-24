package ru.job4j.shape;

/**
*
* class Triangle.
* auhtor Segey
* version 0.1
*/

public class Triangle implements Shape {
/** Method pic.
* @return String
*/
	public String pic() {
		StringBuilder sB = new StringBuilder();
		int h = 3;
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