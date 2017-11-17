package facebookSecond.service;

import facebookSecond.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User findByName(String name);

    User findBySurname(String surname);

    User findByAge(int age);
}
