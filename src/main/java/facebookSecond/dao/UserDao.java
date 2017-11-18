package facebookSecond.dao;

import facebookSecond.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();

    List<User> findByName(String name);

    List<User> findBySurname(String surname);

    List<User> findByAge(int age);
}
