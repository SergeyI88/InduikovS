package ru.job4j.start;

import java.util.Scanner;
/**
*
* class ConsoleInput.
* auhtor IndyukovS
* version 0.1
*/

public class ConsoleInput implements Input {
/**
* method select ввод управляющего числа пользователем.
* @return select
*/
	public int select() {
		int select = Integer.parseInt(scanner.nextLine());
		return select;
	}
/**
* @param scanner
*/
	private Scanner scanner = new Scanner(System.in);
/**
* method askName.
* @param question first
* @return String.
*/
	public String askName(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}
/**
* method askId.
* @param question first
* @return String
*/
	public String askId(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}
/**
* method askDescription.
* @param question first
* @return String
*/
	public String askDescription(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}
/**
* method askCreate.
* @param question first
* @return long
*/
	public long askCreate(String question) {
		System.out.print(question);
		return Long.parseLong(scanner.nextLine());
	}
}