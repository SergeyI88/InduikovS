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
/*/**
* method getLection.
/
public Lection getLesson() {
		return lection;
	}*/
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