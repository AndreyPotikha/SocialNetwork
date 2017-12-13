package facebookSecond.dao;

import facebookSecond.dao.impl.CrudDao;
import facebookSecond.model.Group;
import facebookSecond.model.User;

import java.util.List;

public interface UserDao extends CrudDao<User> {

    List<User> getAllUser();

    List<User> findByName(String name);

    List<User> findBySurname(String surname);

    List<User> findByAge(int age);
}
