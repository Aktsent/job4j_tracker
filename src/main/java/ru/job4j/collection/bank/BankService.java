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
            List<Account> acc = users.get(user);
            if (!acc.contains(account)) {
                acc.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
            for (User user : users.keySet()) {
                if (user.getPassport().equals(passport)) {
                    return user;
                }
            }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> acc = users.get(user);
            for (Account account : acc) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account account = findByRequisite(srcPassport, srcRequisite);
        Account account1 = findByRequisite(destPassport, destRequisite);
        if (account1 != null && account != null) {
            if (account.getBalance() >= amount) {
                account.setBalance(account.getBalance() - amount);
                account1.setBalance(account1.getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}