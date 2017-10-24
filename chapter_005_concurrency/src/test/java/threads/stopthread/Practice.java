package threads.stopthread;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import threads.practice.User;
import threads.practice.UserStorage;

/**
 * Created by Sergey on 13.10.2017.
 */
public class Practice {
    @Test
    public void toCheckTransfer() {
        UserStorage userStorage = new UserStorage();
        userStorage.add(new User(100), new User(20));
        userStorage.transfer(1, 2, 20);
        Assert.assertThat(80, Is.is(userStorage.users.get(0).amount));
    }
}

