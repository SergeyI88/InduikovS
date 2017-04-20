package ru.job4j.proffesionals;

/**
* Teacher.
*
* auhtor Indyukovs
* version 0.1
*/
public class Teacher extends Proffesion {
/**
* @param lection.
*/
private Lection lection = new Lection();
/**
*  Конструктор.
*@param hunger первый аргумент
*@param age  аргумент
*@param wellBeing  аргумент
*@param family  аргумент
*@param level  аргумент
*@param name  аргумент
*/
public Teacher(String hunger, int age, String wellBeing, String family, int level, String name) {
/**
* method super.
*/
	super(hunger, age, wellBeing, family, level, name);
}
/**
* method lesson.
* @param gruppa первый
* @return lection
*/
	public Lection lesson(Gruppa gruppa) {
		gruppa.setQuantityLessons(10);
		lection.setTitle("программирования");
		return lection;
	}
}