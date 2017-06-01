package Generic;

import javax.jws.soap.SOAPBinding;

/**
 * Created by admin on 01.06.2017.
 */
public class UserStore implements Store<User> {
    public SimpleList<User> simpleList;

    public UserStore(int size) {
        this.simpleList = new SimpleList<>(size);
    }
    public UserStore() {
        this.simpleList = new SimpleList<>();
    }

    public void add(User user) {
        simpleList.add(user);
    }
    public void delete(User user) {
        simpleList.delete(user);
    }
    public void update(User user) {
        simpleList.update(user);
    }
}
