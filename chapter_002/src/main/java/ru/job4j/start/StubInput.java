package ru.job4j.start;

import java.util.Scanner;
/**
*
* class StubInput.
* auhtor Sergey
* version 0.1
*/

public class StubInput implements Input {
/**
* @param scanner
*/
	private Scanner scanner = new Scanner(System.in);
/**
* @param answers
*/
	private String[] answers = new String[6];
/**
*
*  онструктор.
* @param answers first
*/
	public StubInput(String[] answers) {
		this.answers = answers;
	}
/**
* @param num
*/
 private int num = 0;
/**
* method select ввод управл¤ющего числа пользователем.
* @return select
*/
	public int select() {
		int select;
		if (num == 0) {
		select = Integer.parseInt(answers[0]);
		num++;
		} else {
		select = Integer.parseInt(answers[5]);
		}
		return select;
	}
/**
* method askName.
* @param question first
* @return String.
*/
	public String askName(String question) {
		System.out.print(question);
		return answers[1];
	}
/**
* method askId.
* @param question first
* @return String
*/
	public String askId(String question) {
		System.out.print(question);
		return answers[2];
	}
/**
* method askDescription.
* @param question first
* @return String
*/
	public String askDescription(String question) {
		System.out.print(question);
		return answers[3];
	}
/**
* method askCreate.
* @param question first
* @return long
*/
	public long askCreate(String question) {
		System.out.print(question);
		return Long.parseLong(answers[4]);
	}
}