package fecebook.network.data;


import fecebook.network.model.User;

import java.util.LinkedList;
import java.util.List;

public class Database {

    public static List<User> getUsers() {
        LinkedList users = new LinkedList<>();
        User user = new User();
        user.setName("Alex");
        user.setSurname("Smith");
        user.setAge(29);
        user.setProffesion("developer");
        users.add(user);
        /*return new User[]{
                new User("Alex", "Smith", 29, "developer"),
                new User("Bob", "Bobkin", 30, "policeman"),
                new User("Andry", "Potikha", 25, "engineer")};
    }*/
        return users;
    }
}
