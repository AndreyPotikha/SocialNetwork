package facebookSecond.service.impl;

import facebookSecond.dao.GroupDao;
import facebookSecond.dao.PostDao;
import facebookSecond.dao.UserDao;
import facebookSecond.dao.impl.DaoImp;
import facebookSecond.model.Group;
import facebookSecond.model.Post;
import facebookSecond.model.User;
import facebookSecond.service.GroupService;
import facebookSecond.service.PostService;
import facebookSecond.service.UserService;

import java.util.List;

public class ServiceImpl implements GroupService, PostService, UserService {

    @Override
    public List<Group> getAllGroups() {
        GroupDao groupDao = new DaoImp();
        return groupDao.getAllGroups();

    }

    @Override
    public List<Post> getAllPost() {
        PostDao postDao = new DaoImp();
        return postDao.getAllPost();
    }

    @Override
    public List<User> getAllUser() {
        UserDao userDao = new DaoImp();
        return userDao.getAllUser();
    }
}
