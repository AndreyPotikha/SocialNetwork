package facebookSecond.data;

import facebookSecond.model.Group;
import facebookSecond.model.Post;
import facebookSecond.model.User;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Database {

    public static List<Group> gettAllGroup() {
        List<Group> groups = new LinkedList<>();
        Group group = new Group();
        group.setName("Andrey");
        group.setDateOfCreate(LocalDate.of(2017, 11, 10));
        group.setFollowrs("500");
        groups.add(group);
        return groups;
    }

    public static List<Post> getAllPost() {
        List<Post> posts = new LinkedList<>();
        Post post = new Post();
        post.setTitle("Titl");
        post.setDescription("Desc");
        posts.add(post);
        return posts;
    }

    public static List<User> getAllUser() {
        List<User> users = new LinkedList<>();
        User user = new User();
        user.setName("Alex");
        users.add(user);
        User user1 = new User();
        user1.setName("Bob");
        users.add(user1);
        return users;
    }
}
