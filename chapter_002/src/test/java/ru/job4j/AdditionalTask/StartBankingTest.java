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
    public void Test() {

        StartBanking startBanking = new StartBanking();
        startBanking.initVisitors();
        startBanking.determination();
        assertThat(7, is(startBanking.getMax().max));
        assertThat(13, is(startBanking.getMax().hours));
        assertThat(22, is(startBanking.getMax().minutes));
    }
}
