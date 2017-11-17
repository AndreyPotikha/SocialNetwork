package facebookSecond.dao;

import facebookSecond.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();

    User findByName(String name);

    User findBySurname(String surname);

    User findByAge(int age);
}
