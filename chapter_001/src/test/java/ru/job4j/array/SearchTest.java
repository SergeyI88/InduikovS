package ru.job4j.array;

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
public class SearchTest {
/**
* Test  searchSubInOrigin.
*/
    @Test
    public void searchSubInOrigin() {
		Search search = new Search();
		boolean a = true;
		boolean b = search.contains("Hellojob", "lojo");
		assertThat(b, is(a));
    }
/**
* Test  searchSubInOrigin.
*/
    @Test
    public void searchSubInOrigin2() {
		Search search = new Search();
		boolean a = false;
		boolean b = search.contains("Hellojob", "lojobo");
		assertThat(b, is(a));
    }
/**
* Test  searchSubInOrigin.
*/
    @Test
    public void searchSubInOrigin3() {
		Search search = new Search();
		boolean a = true;
		boolean b = search.contains("Hellojob", "lojob");
		assertThat(b, is(a));
    }
}