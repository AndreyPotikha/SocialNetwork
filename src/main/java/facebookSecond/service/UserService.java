package facebookSecond.service;

import facebookSecond.model.User;

import java.time.LocalDate;
import java.util.List;

public interface UserService extends CrudService<User>{

    List<User> getAllUser();

    List<User> findByName(String name);

    List<User> findBySurname(String surname);

    List<User> findByAge(int age);
}
