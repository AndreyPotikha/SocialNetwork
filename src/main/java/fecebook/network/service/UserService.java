package fecebook.network.service;

import fecebook.network.data.Database;
import fecebook.network.model.User;

import java.util.Arrays;

public class UserService {

    // todo metod getAll(), getFirst

    public static void main(String[] args) {
        User alex = new User("Alex", "Smith", 29);
//        System.out.println(alex);
//        getAll();
//        getFirst();
//        getLast();
        System.out.println(getByName("Alex"));

        // todo create method getBy...(all fields)
    }

    private static User getByName(String name) {
        User[] users = Database.getUsers();
        for (User user : users) {
            if (name.equals(user.getName())) {
                return user;
            }
        }
        return null;
    }

    private static void getLast() {
        User[] users = Database.getUsers();
        System.out.println(users[users.length-1]);
    }

    private static void getFirst() {
        User[] users = Database.getUsers();
        System.out.println(users[0]);
    }

    private static void getAll() {
        User[] users = Database.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
