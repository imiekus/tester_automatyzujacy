package pl.cdv.classes;

public class UserService {
    User[] users = new User[4];
    public UserService(User[] user) {
        users = user;
    }

    public User getUserByLogin(String login) {
        for (User user: users) {
            if (user.login.equals(login)) {
                return user;
            }
        }
        return null;
    }
}
