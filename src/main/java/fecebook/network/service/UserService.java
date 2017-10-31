package fecebook.network.service;

import fecebook.network.data.Database;
import fecebook.network.model.User;

public class UserService {

    // todo metod getAll(), getFirst

    public static void main(String[] args) {
 //       User alex = new User("Alex", "Smith", 29, "developer");
//        System.out.println(alex);
//        getAll();
//        getFirst();
//        getLast();
//        System.out.println(getByName("Alex"));
        System.out.println(getBySurname("Smith"));
        System.out.println(getByAge(30));
        System.out.println(getByProffesion("engineer"));


        // Пример подключение своей библиотеке.
      /*  final VertexCounter vertexCounter = new VertexCounter();
        final int unicode = vertexCounter.countUnicod("text");
        System.out.println(unicode);*/

        // todo create method getBy...(all fields)
    }

    private static User getByProffesion(String proffesion) {
        User[] users = Database.getUsers();
        for (User user : users) {
            if (proffesion.equals(user.getProffesion())) {
                return user;
            }
        }
        return null;
    }

    private static User getByAge(int age) {
        User[] users = Database.getUsers();
        for (User user : users) {
            if (age == user.getAge()) {
                return user;
            }
        }
        return null;
    }

    private static User getBySurname(String surname) {
        User[] users = Database.getUsers();
        for (User user : users) {
            if (surname.equals(user.getSurname())) {
                return user;
            }
        }
        return null;
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
