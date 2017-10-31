package fecebook.network.data;


import fecebook.network.model.User;

public class Database {

    public static User[] getUsers() {
        return new User[]{
                new User("Alex", "Smith", 29),
                new User("Bob", "Bobkin", 30),
                new User("Andry", "Potikha", 25)};

    }

}
