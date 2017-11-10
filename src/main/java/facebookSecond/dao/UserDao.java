package facebookSecond.dao;


import facebookSecond.data.Database;
import facebookSecond.model.User;

import java.util.List;

public class UserDao {

    public List<User> getAll() {
        return Database.getAll();
    }
}
