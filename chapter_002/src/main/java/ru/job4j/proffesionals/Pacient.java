package ru.job4j.proffesionals;
/**
 * Pacient.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
 public class Pacient {
/**
* @param diagnose
*/
	 private String wellbeing;
/**
 * Получение.
 *@return wellbeing
 */
	 public String getWellbeing() {
		 return wellbeing;
	 }
/**
 * Изменение.
 * @param wellbeing первый аргумент
 */
	 public void setWellbeing(String wellbeing) {
		 this.wellbeing = wellbeing;
	 }
 }