package facebookSecond.service;

import facebookSecond.dao.UserDao1;
import facebookSecond.model.User;

import java.util.List;

public class UserService1 {

    public List<User> getAll() {
        UserDao1 userDao = new UserDao1();
        return userDao.getAll();
    }
}
