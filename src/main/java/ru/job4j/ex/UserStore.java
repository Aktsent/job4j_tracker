package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                return users[i];
            }
        }
        if (users == null) {
            throw new UserNotFoundException("User not found");
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() < 3) {
            throw new UserInvalidException("User not valid");
        }
        return false;
    }

    public static void main(String[] arg) {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException i) {
            i.printStackTrace();
        } catch (UserNotFoundException f) {
            f.printStackTrace();
        }

    }
}
