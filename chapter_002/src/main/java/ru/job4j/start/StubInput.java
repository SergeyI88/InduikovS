package ru.job4j.start;

import java.util.ArrayList;
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
	//private String[] answers = new String[6];
	private ArrayList<String> answers = new ArrayList<>(6);
/**
*
*  онструктор.
* @param answers first
*/
	public StubInput(ArrayList<String> answers) {
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
		select = Integer.parseInt(answers.get(0));
		num++;
		} else {
		select = Integer.parseInt(answers.get(5));
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
		return answers.get(1);
	}
/**
* method askId.
* @param question first
* @return String
*/
	public String askId(String question) {
		System.out.print(question);
		return answers.get(2);
	}
/**
* method askDescription.
* @param question first
* @return String
*/
	public String askDescription(String question) {
		System.out.print(question);
		return answers.get(3);
	}
/**
* method askCreate.
* @param question first
* @return long
*/
	public long askCreate(String question) {
		System.out.print(question);
		return Long.parseLong(answers.get(4));
	}
/**
* method ask.
* @param question first
* @param range second
* @return long
*/
	public int ask(String question, ArrayList<Integer> range) {
	//	throw new UnsupportedOperationException("Unsupported operation");
	return -1;
	}
}