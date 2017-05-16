package ru.job4j.collections.bank;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by admin on 15.05.2017.
 */
public class BankTest {
    @Test
    public void addUserTest() {
        Bank bank = new Bank();
        ArrayList<Account> arrayList = new ArrayList<Account>(Arrays.asList(new Account(100, 12345), new Account(200, 54321)));
        bank.addUser(new User("nick", 123, arrayList));
        Iterator<User> iterator = bank.map.keySet().iterator();
        assertThat("nick", is(iterator.next().name));
    }
    @Test
    public void deleteUser () {
        Bank bank = new Bank();
        ArrayList<Account> arrayList = new ArrayList<Account>(Arrays.asList(new Account(100, 12345), new Account(200, 54321)));
        bank.addUser(new User("nick", 123, arrayList));
        bank.deleteUser(new User("nick", 123));
        assertThat(0, is(bank.map.size()));
    }

    @Test
    public void addAccountUserTest () {
        Bank bank = new Bank();
        ArrayList<Account> arrayList = new ArrayList<Account>(Arrays.asList(new Account(100, 12345), new Account(200, 54321)));
        bank.addUser(new User("nick", 123, arrayList));
        bank.addAccountToUser(new User("nick", 123), new Account(300, 55555));
        assertThat(55555, is(bank.map.get(new User("nick", 123)).get(2).requisites));
    }

    @Test
    public void deleteAccountUserTest () {
        Bank bank = new Bank();
        ArrayList<Account> arrayList = new ArrayList<Account>(Arrays.asList(new Account(100, 12345), new Account(200, 54321)));
        bank.addUser(new User("nick", 123, arrayList));
        bank.addAccountToUser(new User("nick", 123), new Account(300, 55555));
        bank.deleteAccountFromUser(new User("nick", 123), new Account(300, 55555));
        assertThat(2, is(bank.map.get(new User("nick", 123)).size()));
    }


    @Test
    public void getUserAccounts () {
        Bank bank = new Bank();
        ArrayList<Account> arrayList = new ArrayList<Account>(Arrays.asList(new Account(100, 12345), new Account(200, 54321)));
        bank.addUser(new User("nick", 123, arrayList));
        bank.addAccountToUser(new User("nick", 123), new Account(300, 55555));
        arrayList = (ArrayList) bank.getUserAccounts(new User("nick", 123));
        assertThat(arrayList.size(), is(3));
        assertThat(arrayList.get(0).requisites, is(12345));
    }

    @Test
    public void transferMoneyTest () {
        Bank bank = new Bank();
        ArrayList<Account> arrayList = new ArrayList<Account>(Arrays.asList(new Account(100, 12345), new Account(200, 54321)));
        bank.addUser(new User("nick", 123, arrayList));
        bank.addUser(new User("nickolay", 123123, Arrays.asList(new Account(150, 111), new Account(500, 222))));
        bank.addAccountToUser(new User("nick", 123), new Account(300, 55555));
        Iterator<User> iterator = bank.map.keySet().iterator();
        bank.transferMoney(iterator.next(), new Account(100, 12345),iterator.next(), new Account(150, 111), 100);
        assertThat(0.0, is(bank.getUserAccounts(new User("nick", 123)).get(0).value));
        assertThat(250.0, is(bank.getUserAccounts(new User("nickolay", 123123)).get(0).value));
    }
}
