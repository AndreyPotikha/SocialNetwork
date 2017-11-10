package facebookSecond.service;

import facebookSecond.dao.PostDao;
import facebookSecond.dao.UserDao;
import facebookSecond.model.Post;
import facebookSecond.model.User;

import java.util.List;

public class UserService {

    public List<User> getAll() {
        UserDao userDao = new UserDao();
        return userDao.getAll();
    }
}
