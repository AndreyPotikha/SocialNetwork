package facebookSecond.dao.impl;

import facebookSecond.dao.PostDao;
import facebookSecond.data.Database;
import facebookSecond.model.Post;
import facebookSecond.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PostDaoImpl implements PostDao{

    @Override
    public List<Post> getAllPost() {
        return Database.getAllPost();
    }

    @Override
    public List<Post> findByTitle(String title) {
        List<Post> posts = Database.getAllPost();
        List<Post> returnPost = new ArrayList<>();
        for (Post post : posts) {
            if (post.getTitle().contains(title)) {
                returnPost.add(post);
            }
        }
        return returnPost;
    }

    @Override
    public List<Post> findByDate(LocalDate date) {
        List<Post> posts = Database.getAllPost();
        List<Post> returnPost = new ArrayList<>();
        for (Post post : posts) {
            if (post.getDateOfPost().equals(date)) {
                returnPost.add(post);
            }
        }
        return returnPost;
    }

    @Override
    public void creat(Post post) {
        System.out.println(post.getTitle() + " created");
    }

    @Override
    public void update(Post post) {
        System.out.println(post.getTitle() + " update");
    }

    @Override
    public void del(Long idPost) {
        System.out.println(idPost + " delated");
    }

}
