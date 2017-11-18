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
        post.setTitle("football news");
        post.setDescription("Dynamo champion");
        post.setDateOfPost(LocalDate.of(2017, 11, 15));
        posts.add(post);
        Post post1 = new Post();
        post1.setTitle("Boxing News");
        post1.setDescription("Lomachenko is the best");
        post1.setDateOfPost(LocalDate.of(2017, 11, 15));
        posts.add(post1);
        return posts;
    }

    public static List<User> getAllUser() {
        List<User> users = new LinkedList<>();
        User user = new User();
        user.setName("Alex");
        user.setSurname("Smith");
        user.setAge(25);
        users.add(user);
        User user1 = new User();
        user1.setName("Bob");
        user1.setSurname("Johnson");
        user1.setAge(40);
        users.add(user1);
        return users;
    }

}
