package facebookSecond.dao.impl;

import facebookSecond.dao.PostDao;
import facebookSecond.data.Database;
import facebookSecond.model.Post;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class PostDaoImpl implements PostDao{

    @Override
    public List<Post> getAllPost() {
        return Database.getAllPost();
    }

    @Override
    public Post findByTitle(String title) {
        List<Post> posts = Database.getAllPost();
        for (Post post : posts) {
            if (post.getTitle().contains(title)) {
                return post;
            }
        }
        return null;
    }

    @Override
    public Post findByDate(LocalDate date) {
        List<Post> posts = Database.getAllPost();
        for (Post post : posts) {
            if (post.getDateOfPost().equals(date)) {
                return post;
            }
        }
        return null;
    }
}
