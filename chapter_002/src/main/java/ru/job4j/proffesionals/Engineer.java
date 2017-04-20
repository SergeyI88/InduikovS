package ru.job4j.proffesionals;

/**
 * Engineer.
 *
 * @author IndyukovS
 * @version $Id$
 * @since 0.1
 */
 public class Engineer extends Proffesion {
/**
*  Конструктор.
*@param hunger первый аргумент
*@param age  аргумент
*@param wellBeing  аргумент
*@param family  аргумент
*@param level  аргумент
*@param name  аргумент
*/
public Engineer(String hunger, int age, String wellBeing, String family, int level, String name) {
/**
* method super.
*/
	super(hunger, age, wellBeing, family, level, name);
}
/**
 * Изменение состояние после ремонта.
 * @param mashine параметр "состояние"
 */
	  public void repair(Mashine mashine) {
		  mashine.setState("хорошо");
	  }
 }