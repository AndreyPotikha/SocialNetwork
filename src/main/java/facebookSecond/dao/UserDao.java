package facebookSecond.dao;

import facebookSecond.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();

    User getByName(String name);
}
