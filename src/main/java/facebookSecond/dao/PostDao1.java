package facebookSecond.dao;

import facebookSecond.data.Database;
import facebookSecond.model.Post;

import java.util.List;

public class PostDao1 {

    public List<Post> getAllPost() {
        return Database.getAllPost();
    }
}
