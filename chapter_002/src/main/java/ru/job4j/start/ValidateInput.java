package ru.job4j.start;

//import java.util.Scanner;

import java.util.ArrayList;

/**
*
* class ConsoleInput.
* auhtor IndyukovS
* version 0.1
*/

public class ValidateInput extends ConsoleInput {
/**
* method ask.
* @param question first
* @param range second
* @return value
*/
	public int ask(String question, ArrayList<Integer> range) {
		boolean invalid = true;
		int value = 0;
	do {
		try {
			value = super.ask(question, range);
			invalid = false;
		} catch (MenuOutException nfe) {
			System.out.println("Выход за границы меню");
		} catch (NumberFormatException moe) {
			System.out.println("Неккоректные данные");
		}
	} while (invalid);
	return value;
	}
}