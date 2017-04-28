package ru.job4j.start;

/**
*
* class BaseAction.
* auhtor Sergey
* version 0.1
*/
public abstract class BaseAction implements UserAction {
/**
* Конструктор.
* @param name first
*/
	public BaseAction(String name) {

	}
/**
* method key.
* @return String
*/
	public String info() {
		return (String.format("%s. %s", key(), "Anything"));
	}
}