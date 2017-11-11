package facebookSecond.service.impl;

import facebookSecond.dao.PostDao;
import facebookSecond.dao.impl.PostDaoImpl;
import facebookSecond.model.Post;
import facebookSecond.service.PostService;

import java.util.List;

public class PostServiceImpl implements PostService{

    @Override
    public List<Post> getAllPost() {
        PostDao postDao = new PostDaoImpl();
        return postDao.getAllPost();
    }
}
