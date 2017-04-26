package ru.job4j.start;
/**
*
* interface.
* auhtor Sergey
* version 0.1
*/

public interface UserAction {
/**
* method key.
* @return int
*/
	int key();
/**
* method execute.
* @param input first
* @param tracker second
*/
	void execute(Input input, Tracker tracker);
/**
* method key.
* @return String
*/
	String info();
}