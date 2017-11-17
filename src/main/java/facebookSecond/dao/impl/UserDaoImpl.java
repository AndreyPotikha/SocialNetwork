package facebookSecond.dao.impl;

import facebookSecond.dao.UserDao;
import facebookSecond.data.Database;
import facebookSecond.model.User;

import java.util.List;

public class UserDaoImpl implements UserDao{


    @Override
    public List<User> getAllUser() {
        return Database.getAllUser();
    }

    @Override
    public User findByName(String name) {
        List<User> allUser = Database.getAllUser();
        for (User user : allUser) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User findBySurname(String surname) {
        List<User> allUsers = Database.getAllUser();
        for (User user : allUsers) {
            if (user.getSurname().equals(surname)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User findByAge(int age) {
        List<User> allUsers = Database.getAllUser();
        for (User user : allUsers) {
            if (user.getAge() == age) {
                return user;
            }
        }
        return null;
    }
}
