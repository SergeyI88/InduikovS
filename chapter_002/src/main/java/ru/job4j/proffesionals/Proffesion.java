package ru.job4j.proffesionals;
/**
 * Profession.
 *
 * @author Sergey Indyukov (onl.ont@mail.ru)
 * @version $Id$
 * @since 0.1
 */
 public class Proffesion {
/**
* @param age
*/
	 private int age;
/**
* @param level
*/
	 private int level;
/**
* @param name
*/
	 private String name;
/**
* @param family
*/
	 private String family;
/**
* @param wellBeing
*/
	 private String wellBeing;
/**
* @param hunger
*/
	 private String hunger;

/**
*Конструктор.
*/
	 public Proffesion() {
	 }

/**
*Конструктор.
*@param hunger первый аргумент
*@param age  аргумент
*@param wellBeing  аргумент
*@param family  аргумент
*@param level  аргумент
*@param name  аргумент
*/
	 public Proffesion(String hunger, int age, String wellBeing, String family, int level, String name) {
		 this.hunger = hunger;
		 this.age = age;
		 this.wellBeing = wellBeing;
		 this.family = family;
		 this.level = level;
		 this.name = name;
	 }
/**
*getHunger.
* @return hunger
*/
	 public String getHunger() {
		 return hunger;
	 }
/**
*getWellbeing.
* @return wellBeing
*/
	 public String getWellbeing() {
		 return wellBeing;
	 }
/**
*getFamily.
* @return family
*/
	 public String getFamily() {
		 return family;
	 }
/**
*getName.
* @return name
*/
	 public String getName() {
		 return name;
	 }
/**
*getAge.
* @return age
*/
	 public int getAge() {
		 return age;
	 }
/**
*getLevel.
* @return level
*/
	 public int getLevel() {
		 return level;
	 }
 }