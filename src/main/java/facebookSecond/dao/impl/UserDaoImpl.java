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
    public User getByName(String name) {
        List<User> allUser = Database.getAllUser();
        for (User user : allUser) {
            if (user.getName().equals(name)) {
                return user;
            } else {
                return null;
            }
        }
        return null;
    }
}
