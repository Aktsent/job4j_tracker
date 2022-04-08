package ru.job4j.collection.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        ArrayList<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> usrs = users.get(users.keySet());
            if (!usrs.contains(account)) {
                usrs.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
            for (User user : users.keySet()) {
                if (user.getPassport().contains(passport)) {
                    return user;
                }
            }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        ArrayList<Account> accounts = new ArrayList<>();
        boolean rsl = false;
        if (amount > 0) {

            rsl = true;
        }
        return rsl;
    }
}