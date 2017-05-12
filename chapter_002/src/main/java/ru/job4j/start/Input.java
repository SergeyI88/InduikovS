package ru.job4j.start;

import java.util.ArrayList;

/**
*
* class Input.
* auhtor IndyukovS
* version 0.1
*/

public interface Input {
/**
* method select ввод управл¤ющего числа пользователем.
* @return select
*/
	int select();
/**
* method askName.
* @param question first
* @return String.
*/
	String askName(String question);
/**
* method askId.
* @param question first
* @return String
*/
	String askId(String question);
/**
* method askDescription.
* @param question first
* @return String
*/
	String askDescription(String question);
/**
* method askCreate.
* @param question first
* @return long
*/
	long askCreate(String question);
/**
* method ask.
* @param question first
* @param range second
* @return int
*/
	int ask(String question, ArrayList<Integer> range);
}