package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        ArrayList<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        users.get(findByPassport(passport));
        if (!users.containsValue(account)) {
            account.getRequisite();
        }
    }

    public User findByPassport(String passport) {
        if (passport != null) {
            for (User user : users.keySet()) {
                user.setPassport(passport);
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        users.get(findByPassport(passport));
        if (findByPassport(passport) != null) {
            findByPassport(requisite);
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