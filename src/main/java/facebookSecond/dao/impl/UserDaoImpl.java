package facebookSecond.dao.impl;

import facebookSecond.dao.UserDao;
import facebookSecond.data.Database;
import facebookSecond.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{


    @Override
    public List<User> getAllUser() {
        return Database.getAllUser();
    }

    @Override
    public List<User> findByName(String name) {
        List<User> allUser = Database.getAllUser();
        List<User> retunUsers = new ArrayList<>();
        for (User user : allUser) {
            if (user.getName().equals(name)) {
                retunUsers.add(user);
            }
        }
        return retunUsers;
    }

    @Override
    public List<User> findBySurname(String surname) {
        List<User> allUsers = Database.getAllUser();
        List<User> retunUsers = new ArrayList<>();
        for (User user : allUsers) {
            if (user.getSurname().equals(surname)) {
                retunUsers.add(user);
            }
        }
        return retunUsers;
    }

    @Override
    public List<User> findByAge(int age) {
        List<User> allUsers = Database.getAllUser();
        List<User> retunUsers = new ArrayList<>();
        for (User user : allUsers) {
            if (user.getAge() == age) {
                retunUsers.add(user);
            }
        }
        return retunUsers;
    }

    @Override
    public void creat(User user) {
        System.out.println(user.getName() + " created");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getName() + " updated");
    }

    @Override
    public void del(Long id) {
        System.out.println("user with id: " + id + " deleted");
    }


}
