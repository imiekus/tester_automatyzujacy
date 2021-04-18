package pl.cdv.classes;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[4];
        users[0] = new User("testuser1","haslo1","testuser1@test.pl",23);
        users[1] = new User("testuser2","haslo2","testuser2@test.pl",24);
        users[2] = new User("testuser3","haslo3","testuser3@test.pl",25);
        users[3] = new User("testuser4","haslo4","testuser4@test.pl",26);

        UserService userService = new UserService(users);
        String searchedUser = "testuser1";
        User user = userService.getUserByLogin(searchedUser);
        if (user != null) {
            System.out.println("User found: " + user.email);
        } else {
            System.out.println("User with login: " + searchedUser + " not found.");
        }
    }
}
