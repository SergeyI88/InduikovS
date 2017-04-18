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
 * Изменение состояние после ремонта.
 * @param mashine параметр "состояние"
 */
	  public void repair(Mashine mashine) {
		  mashine.setState("хорошо");
	  }
 }