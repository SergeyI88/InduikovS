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