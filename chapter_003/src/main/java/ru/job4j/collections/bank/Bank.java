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
            for (User user1 : map.keySet()) {
                if (user.equals(user1)) {
                    user1.list.add(account);

                }
            }
        }
    }

    public void deleteAccountFromUser(User user, Account account) {
        if (user != null && map.containsKey(user)) {
            for (User user1 : map.keySet()) {
                if (user.equals(user1)) {
                    user1.list.remove(account);
                }
            }
        }
    }

    public List<Account> getUserAccounts(User user) {
        List<Account> accounts = new ArrayList<>();
        if (user != null && map.containsKey(user)) {
            for (User user1 : map.keySet()) {
                if (user.equals(user1)) {
                    accounts = user1.list;
                }
            }
        }
        return accounts;
    }

    public boolean transferMoney(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {
        boolean answer = false;
        User src = null;
        User dst = null;
        Set<User> set = map.keySet();
        for (User user : set) {
            if (user.equals(srcUser)) {
                src = user;
            }
            if (user != src && user.equals(dstUser)) {
                dst = user;
            }
        }
        if (map.containsKey(src) && map.containsKey(dst)) {
            if (map.get(srcUser).contains(srcAccount) && map.get(dst).contains(dstAccount)) {
                int indexSrc = map.get(src).indexOf(srcAccount);
                int indexDst = map.get(dst).indexOf(dstAccount);
                if (src != null && dst != null && src.list.get(indexSrc).value - amount >= 0) {
                    Account accountSrc = new Account(src.list.get(indexSrc).value - amount, src.list.get(indexSrc).requisites);
                    src.list.set(indexSrc, accountSrc);
                    Account accountDst = new Account(dst.list.get(indexDst).value + amount, dst.list.get(indexDst).requisites);
                    answer = true;
                    map.get(src).set(indexSrc, accountSrc);
                    map.get(dst).set(indexDst, accountDst);
                }
            }
        }
        return answer;
    }
}
