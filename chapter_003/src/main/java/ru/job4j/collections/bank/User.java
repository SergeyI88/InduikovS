package ru.job4j.collections.bank;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 14.05.2017.
 */
public class User {
    protected String name;
    protected int passport;
    protected List<Account> list;

    public User(String name, int passport, List<Account> list) {
        this.name = name;
        this.passport = passport;
        this.list = list;
    }

    public User(String name, int passport) {
        this.name = name;
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (passport != user.passport) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
