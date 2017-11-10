package facebookSecond.data;

import facebookSecond.model.Post;
import facebookSecond.model.User;

import java.util.LinkedList;
import java.util.List;

public class Database {

    public static List<Post> getAllPost() {
        List<Post> posts = new LinkedList<>();
        Post post = new Post();
        post.setTitle("Titl");
        post.setDescription("Desc");
        posts.add(post);
        return posts;
    }

    public static List<User> getAll() {
        List<User> users = new LinkedList<>();
        User user = new User();
        user.setName("Alex");
        users.add(user);
        return users;
    }
}
