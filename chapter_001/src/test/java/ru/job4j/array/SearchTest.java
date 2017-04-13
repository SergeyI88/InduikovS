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
		boolean b = search.contains("Hello", "lo");
		assertThat(b, is(a));
    }
}