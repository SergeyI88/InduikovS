package ru.job4j.AdditionalTask;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by admin on 03.05.2017.
 */
public class StartBankingTest {
    /**
     * Test.
     */
    @Test
    public void test() {

        StartBanking startBanking = new StartBanking();
        startBanking.initVisitors();
        startBanking.determination();
        String string = String.format("%s %s %s %s %s %s", "В", startBanking.getMax().getHours(), "часов", startBanking.getMax().getMinutes(), "минуты было больше всего посетителей:", startBanking.getMax().getMax());
        assertThat("В 13 часов 22 минуты было больше всего посетителей: 7", is(string));
    }
}
