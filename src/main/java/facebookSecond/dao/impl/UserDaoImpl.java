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
}
