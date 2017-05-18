package ru.job4j.collections.bank;

import javax.jws.soap.SOAPBinding;
import java.util.*;


/**
 * Created by admin on 14.05.2017.
 */
public class Bank {
    protected Map<User, List<Account>> map = new LinkedHashMap<>();

    public void addUser(User user) {
        map.put(user, user.list);
    }

    public void deleteUser(User user) {
        if (map.containsKey(user)) {
            System.out.println("log");
            map.remove(user);
        }
    }

    public void addAccountToUser(User user, Account account) {
        if (user != null && map.containsKey(user)) {
            List accounts = map.get(user);
            accounts.add(account);
        }
    }

    public void deleteAccountFromUser(User user, Account account) {
        if (user != null && map.containsKey(user)) {
            List accounts = map.get(user);
            accounts.remove(account);
        }
    }

    public List<Account> getUserAccounts(User user) {
        List accounts = null;
        if (user != null && map.containsKey(user)) {
            accounts = map.get(user);
        }
        return accounts;
    }

    public boolean transferMoney(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {
        boolean answer = false;
        if (srcUser != null && dstUser != null && map.containsKey(srcUser) && map.containsKey(dstUser)) {
            if (map.get(srcUser).contains(srcAccount) && map.get(dstUser).contains(dstAccount)) {
                for (Account account : map.get(srcUser)) {
                    if (account.equals(srcAccount)) {
                        if (account.value - amount >= 0) {
                            account.value -= amount;
                            answer = true;
                        }
                    }
                }
                for (Account account : map.get(dstUser)) {
                    if (account.equals(dstAccount) && answer) {
                        account.value += amount;
                    }
                }
            }
        }
        return answer;
    }
}
