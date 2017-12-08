package fecebook.network.service;

import fecebook.network.data.Database;
import fecebook.network.model.User;

import java.util.List;

public class UserService {

    // todo metod getAllUser(), getFirst

    public static void main(String[] args) {
 //       User alex = new User("Alex", "Smith", 29, "developer");
//        System.out.println(alex);
//        getAllUser();
//        getFirst();
//        getLast();
//        System.out.println(findByName("Alex"));
//        System.out.println(getBySurname("Smith"));
//        System.out.println(getByAge(30));
        System.out.println(getByProffesion("developer"));


        // Пример подключение своей библиотеке.
      /*  final VertexCounter vertexCounter = new VertexCounter();
        final int unicode = vertexCounter.countUnicod("text");
        System.out.println(unicode);*/

    }

    private static User getByProffesion(String proffesion) {
        List<User> users = Database.getUsers();
//        User[] users = Database.getUsers();
        for (User user : users) {
            if (proffesion.equals(user.getProffesion())) {
                return user;
            }
        }
        return null;
    }

    private static User getByAge(int age) {
        List<User> users = Database.getUsers();
//        User[] users = Database.getUsers();
        for (User user : users) {
            if (age == user.getAge()) {
                return user;
            }
        }
        return null;
    }

    private static User getBySurname(String surname) {
        List<User> users = Database.getUsers();
//        User[] users = Database.getUsers();
        for (User user : users) {
            if (surname.equals(user.getSurname())) {
                return user;
            }
        }
        return null;
    }

    private static User getByName(String name) {
        List<User> users = Database.getUsers();
//        User[] users = Database.getUsers();
        for (User user : users) {
            if (name.equals(user.getName())) {
                return user;
            }
        }
        return null;
    }

    private static void getLast() {
        List<User> users = Database.getUsers();
//        User[] users = Database.getUsers();
        System.out.println(users.size() - 1);

    }

    private static void getFirst() {
        List<User> users = Database.getUsers();
        System.out.println(users.size() - 1);
//        User[] users = Database.getUsers();
//        System.out.println(users[0]);
    }

    private static void getAll() {
        List<User> users = Database.getUsers();
//        User[] users = Database.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
