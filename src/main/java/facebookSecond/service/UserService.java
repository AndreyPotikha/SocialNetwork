package facebookSecond.service;

import facebookSecond.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    List<User> findByName(String name);

    List<User> findBySurname(String surname);

    List<User> findByAge(int age);
}
