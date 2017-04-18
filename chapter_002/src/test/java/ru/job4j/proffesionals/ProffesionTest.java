package ru.job4j.proffesionals;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Sergey Indyukov (mailto:onl.ont@mail.ri)
* @version $Id$
* @since 0.1
*/

public class ProffesionTest {
/**
* Test doctorTest.
*/
@Test
public void doctorTest() {
        Doctor ser = new Doctor();
		Pacient pac = new Pacient();
		Diagnose dia = new Diagnose();
		String expected = "goodlife";
		dia = ser.heal(pac);
		String sB = pac.getWellbeing() + dia.getDiagnose();
        assertThat(sB, is(expected));
    }
/**
* Test engineerTest.
*/
@Test
public void engineerTest() {
        Engineer ser = new Engineer();
		Mashine mashine = new Mashine();
		String expected = "Инженер Макс починил станок хорошо";
		ser.setName("Макс");
		ser.repair(mashine);
		String sB = "Инженер " + ser.getName() + " починил станок " + mashine.getState();
        assertThat(sB, is(expected));
    }
/**
* Test teacherTest.
*/
@Test
public void teacherTest() {
        Teacher teacher = new Teacher();
		teacher.setName("Иван");
		Lection lection = new Lection();
		Gruppa gruppa = new Gruppa();
		lection = teacher.lesson(gruppa);
		String expected = "Преподователь Иван провел 10 лекций программирования";
		String sB = "Преподователь " + teacher.getName() + " провел " + gruppa.getQuantityLessons() + " лекций " + lection.getTitle();
        assertThat(sB, is(expected));
    }
}