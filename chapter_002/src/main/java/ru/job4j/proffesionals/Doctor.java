package ru.job4j.proffesionals;
//import ru.job4j.proffesionals.*;
/**
 * Doctor.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
 public class Doctor extends Proffesion {
/**
*  Конструктор.
*@param hunger первый аргумент
*@param age  аргумент
*@param wellBeing  аргумент
*@param family  аргумент
*@param level  аргумент
*@param name  аргумент
*/
public Doctor(String hunger, int age, String wellBeing, String family, int level, String name) {
/**
* method super.
*/
	super(hunger, age, wellBeing, family, level, name);
}
 /**
 * Лечение и возвражение диагноза.
 * @param pacient параметр "пациент"
 * @return a
 */
	  public Diagnose heal(Pacient pacient) {
		  Diagnose dia = new Diagnose();
		  pacient.setWellbeing("good");
		  dia.setDiagnose("life");
		  return dia;
	  }
 }