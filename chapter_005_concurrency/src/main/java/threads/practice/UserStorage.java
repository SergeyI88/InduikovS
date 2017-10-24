package threads.practice;

import net.jcip.annotations.ThreadSafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * The class is demonstrating problems in multi-thread.
 *
 * @author by Sergey on 13.10.2017.
 * @version 1.0
 */
@ThreadSafe
public class UserStorage {
    /**
     * This is collection stores users
     */
    public ArrayList<User> users = new ArrayList<>();

    /**
     * The method add users in collection.
     * @param user
     */
    public synchronized void add(User... user) {
        users.addAll(Arrays.asList(user));
    }

    /**
     * The method remove an user in collection.
     * @param user
     */
    public synchronized void delete(User user) {
        users.remove(user);
    }

    /**
     * The method update data about user.
     * @param user
     */
    public synchronized void update(User user) {
        if (users.indexOf(user) != -1) {
            users.add(users.indexOf(user), user);
        }
    }

    /**
     * The method spend the transfer between users.
     * @param fromId - from this user
     * @param toId - to user
     * @param amount - quantity
     */
    public synchronized void transfer(int fromId, int toId, int amount) {
        for (User u : users) {
            if (u.id == fromId) {
                for (User user : users) {
                    if (user.id == toId) {
                        u.amount -= amount;
                        user.amount += amount;
                    }
                }
            }
        }
    }
}
