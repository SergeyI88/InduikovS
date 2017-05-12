package ru.job4j.collections;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by admin on 12.05.2017.
 */
public class UserConverTest {
    @Test
    public void TestHashMap() {
        User[] users = new User[3];
        users[0] = new User("name", 13, "city");
        users[1] = new User("name2", 132, "city2");
        users[2] = new User("name3", 133, "city3");
        ArrayList<User> arrayList = new ArrayList<User>(Arrays.asList(users));
        Map<Integer, User> map = new UserConvert().process(arrayList);
        assertThat(String.format("%s %s", "name", "city"), is(map.get(13).toString()));
        assertThat(map.containsKey(13), is(true));
    }
}
