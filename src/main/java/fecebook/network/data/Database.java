package fecebook.network.data;


import fecebook.network.model.User;

public class Database {

    public static User[] getUsers() {
        return new User[]{
                new User("Alex", "Smith", 29, "developer"),
                new User("Bob", "Bobkin", 30, "policeman"),
                new User("Andry", "Potikha", 25, "engineer")};

    }

}
