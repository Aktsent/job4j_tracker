package ru.job4j.collection.bank;

import java.util.*;

/**
 * Класс описывает модель для банковской системы
 */

public class BankService {
    /**
     * Хранение задания осуществляется в коллекции типа Map
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя, если данного пользователя нет.
     * @param user пользователь который добавляется
     */

    public void addUser(User user) {
        ArrayList<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    /**
     * Метод добавляет аккаунт, если данното аккаунта нету.
     * @param passport паспортные данные которые проверяются
     * @param account аккаунт который добавляется
     */

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> acc = users.get(user.get());
            if (!acc.contains(account)) {
                acc.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск пользователя по паспорту, сравнивая имеющиеся паспорта в системе.
     * @param passport паспортные данные для поиска
     * @return возвращает найденного пользователя или null если он не найден
     */

    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод осуществляет поиск аккаунта по реквизитам,
     * сравнивая имеющиеся реквизиты в системе с теми что нужно найти.
     * @param passport паспортные данные для поиска
     * @param requisite реквизиты для поиска
     * @return возвращает найденый аккаунт по реквизитам или null если аккаунт не найден
     */

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(acc -> acc.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод переводит средства между счетами аккаунта, если данный счет найден и хватает суммы
     * @param srcPassport исходный паспорт с которого нужно перевести средства
     * @param srcRequisite исходные реквизиты с которого нужно перевести средства
     * @param destPassport паспорт на который нужно перевести средства
     * @param destRequisite реквизиты на которые нужно перевести средства
     * @param amount сумма перевода
     * @return возвращает результат перевода в случае если на балансе имеются необходимая сумма
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> account = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> account1 = findByRequisite(destPassport, destRequisite);
        if (account1.isPresent() && account.isPresent()) {
            if (account.get().getBalance() >= amount) {
                account.get().setBalance(account.get().getBalance() - amount);
                account1.get().setBalance(account1.get().getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}