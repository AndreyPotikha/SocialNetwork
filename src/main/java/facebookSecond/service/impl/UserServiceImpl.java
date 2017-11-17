package facebookSecond.service.impl;

import facebookSecond.dao.UserDao;
import facebookSecond.dao.factory.DaoFactory;
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
    public User findByName(String name) {
        if (name == null) {
            return new User();
        }
        return DaoFactory.getUserDao().findByName(name);
    }

    @Override
    public User findBySurname(String surname) {
        if (surname == null) {
            return null;
        }
        return DaoFactory.getUserDao().findBySurname(surname);
    }

    @Override
    public User findByAge(int age) {
        String ageString = String.valueOf(age);
        if (ageString == null) {
            return null;
        }
        return DaoFactory.getUserDao().findByAge(age);
    }
}
