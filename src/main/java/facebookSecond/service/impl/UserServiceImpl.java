package facebookSecond.service.impl;

import facebookSecond.dao.UserDao;
import facebookSecond.dao.factory.DaoFactory;
import facebookSecond.dao.impl.UserDaoImpl;
import facebookSecond.model.User;
import facebookSecond.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Override
    public List<User> getAllUser() {
         UserDao userDao = DaoFactory.getUserDao();
        return userDao.getAllUser();

        /*UserDao userDao = new UserDaoImpl();
        return userDao.getAllUser();*/
    }

    @Override
    public User getByName(String name) {
        if (name == null) {
            return new User();
        }
        return DaoFactory.getUserDao().getByName(name);
    }
}
