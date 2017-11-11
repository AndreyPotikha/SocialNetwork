package facebookSecond.dao.impl;

import facebookSecond.dao.PostDao;
import facebookSecond.data.Database;
import facebookSecond.model.Post;

import java.util.List;

public class PostDaoImpl implements PostDao{

    @Override
    public List<Post> getAllPost() {
        return Database.getAllPost();
    }
}
