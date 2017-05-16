package ru.job4j.collections.bank;

/**
 * Created by admin on 14.05.2017.
 */
public class Account {
   protected double value;
   protected int requisites;

    public Account(double value, int requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public Account() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return requisites == account.requisites;
    }

    @Override
    public int hashCode() {
        return requisites;
    }

    @Override
    public String toString() {
        return "Account{" +
                "requisites=" + requisites +
                '}';
    }
}
