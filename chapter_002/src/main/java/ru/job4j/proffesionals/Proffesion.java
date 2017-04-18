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
*SetHunger.
*@param hunger первый аргумент
*/
	 public void setHunger(String hunger) {
		 this.hunger = hunger;
	 }

/**
*SetWellBeing.
*@param wellBeing первый аргумент
*/
	 public void setWellBeing(String wellBeing) {
		 this.wellBeing = wellBeing;
	 }

/**
*SetFamily.
*@param family первый аргумент
*/
	 public void setFamily(String family) {
		 this.family = family;
	 }

/**
*SetName.
*@param name первый аргумент
*/
	 public void setName(String name) {
		 this.name = name;
	 }
/**
*SetLevel.
*@param level первый аргумент
*/
	 public void setLevel(int level) {
		 this.level = level;
	 }
/**
*SetAge.
*@param age первый аргумент
*/
	 public void setAge(int age) {
		 this.age = age;
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