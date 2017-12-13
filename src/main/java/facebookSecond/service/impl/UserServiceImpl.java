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
    public List<User> findByName(String name) {
        if (name == null) {
            return null;
        }
        return DaoFactory.getUserDao().findByName(name);
    }

    @Override
    public List<User> findBySurname(String surname) {
        if (surname == null) {
            return null;
        }
        return DaoFactory.getUserDao().findBySurname(surname);
    }

    @Override
    public List<User> findByAge(int age) {
        String ageString = String.valueOf(age);
        if (ageString == null) {
            return null;
        }
        return DaoFactory.getUserDao().findByAge(age);
    }

    @Override
    public void creat(User user) {
        UserDao userDao = new UserDaoImpl();
        userDao.creat(user);
    }

    @Override
    public void update(User user) {
        UserDao userDao = new UserDaoImpl();
        userDao.update(user);
    }

    @Override
    public void del(Long id) {
        UserDao userDao = new UserDaoImpl();
        userDao.del(id);
    }


}
