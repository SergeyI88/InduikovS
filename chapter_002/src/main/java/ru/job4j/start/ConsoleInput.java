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
		int value = 0;
		boolean exist = true;
		do {
			try {
				value = Integer.parseInt(scanner.nextLine());
				exist = false;
			} catch (NumberFormatException nfe) {
				System.out.print("Введите 6, чтобы выйти или любое другое число, чтобы продолжить: ");
				}
		} while (exist);
		return value;
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
		long value = 0;
		boolean exist = true;
		do {
		try {
			value = Long.parseLong(scanner.nextLine());
			exist = false;
		} catch (NumberFormatException nfe) {
			System.out.println("Неккоректные данные");
			System.out.println("Введите данные заново: ");
		}
	} while (exist);
	return value;
	}
/**
* method askCreate.
* @param question first
* @param range second
* @return long
*/
	public int ask(String question, int[] range) {
		System.out.print(question);
		int key = Integer.valueOf(this.select());
		boolean exist = false;
		for (int value : range) {
			if (value == key) {
				exist = true;
				break;
			}
		}
		if (exist) {
			return key;
		} else {
			throw new MenuOutException("Out of menu range.");
		}
	}
}