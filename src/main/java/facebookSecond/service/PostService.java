package facebookSecond.service;

import facebookSecond.dao.PostDao;
import facebookSecond.model.Post;

import java.util.List;

public class PostService {

    public List<Post> getAllPost() {
        PostDao postDao = new PostDao();
        return postDao.getAllPost();
    }
}
