package threads.practice;

/**
 * The class was creating for execute the task "Create and realization UserStorage".
 *
 * @author  by Sergey on 13.10.2017.
 * @version 1.0
 */
public class User {
    /**
     *
     */
    protected static int idAll = 1;
    protected int id;
    public int amount;

    /**
     *
     * @param amount
     */
    public User(int amount) {
        this.amount = amount;
        id = idAll++;
    }

    public User() {
        id = idAll++;
    }

    public User(int i, int i1) {
        id = i;
        amount = i1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id == user.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
