package facebookSecond.service;

import facebookSecond.dao.PostDao1;
import facebookSecond.model.Post;

import java.util.List;

public class PostService1 {

    public List<Post> getAllPost() {
        PostDao1 postDao = new PostDao1();
        return postDao.getAllPost();
    }
}
