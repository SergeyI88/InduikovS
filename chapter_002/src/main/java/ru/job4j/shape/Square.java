package ru.job4j.shape;

/**
*
* class Square.
* auhtor Segey
* version 0.1
*/

public class Square implements Shape {
/**
* methid pic.
* @return String
*/
	public String pic() {
		StringBuilder sB = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sB.append("&");
			}
			sB.append(System.getProperty("line.separator"));
		}
		return sB.toString();
	}
}