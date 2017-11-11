package facebookSecond.dao.impl;

import facebookSecond.dao.GroupDao;
import facebookSecond.dao.PostDao;
import facebookSecond.dao.UserDao;
import facebookSecond.data.Database;
import facebookSecond.model.Group;
import facebookSecond.model.Post;
import facebookSecond.model.User;

import java.util.List;

public class DaoImp implements GroupDao, PostDao, UserDao{
    @Override
    public List<Group> getAllGroups() {
        return Database.gettAllGroup();
    }

    @Override
    public List<Post> getAllPost() {
        return Database.getAllPost();
    }

    @Override
    public List<User> getAllUser() {
        return Database.getAllUser();
    }
}
