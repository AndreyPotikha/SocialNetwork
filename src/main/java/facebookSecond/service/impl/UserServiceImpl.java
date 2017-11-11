package facebookSecond.service.impl;

import facebookSecond.dao.UserDao;
import facebookSecond.dao.impl.UserDaoImpl;
import facebookSecond.model.User;
import facebookSecond.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Override
    public List<User> getAllUser() {
        UserDao userDao = new UserDaoImpl();
        return userDao.getAllUser();
    }
}
