package facebookSecond.controller;

import facebookSecond.model.Post;
import facebookSecond.model.User;
import facebookSecond.service.PostService;
import facebookSecond.service.UserService;
import facebookSecond.service.impl.PostServiceImpl;
import facebookSecond.service.impl.UserServiceImpl;

import java.time.LocalDate;
import java.util.List;

public class PostController {

    public static void main(String[] args) {

        Post post = new Post();
        post.setTitle("hello");

        PostService postService = new PostServiceImpl();
        postService.update(post);
        postService.creat(post);
        postService.del(1L);


//      Search by title
        PostService postTitle = new PostServiceImpl();
        List<Post> title = postTitle.findByTitle("football");
        System.out.println(title);

//      Search by data
        PostService postData = new PostServiceImpl();
        List<Post> data = postTitle.findByData(LocalDate.of(2017, 11, 15));
        System.out.println(data);
       /* PostService postService = new PostServiceImpl();
        List<Post> all = postService.getAllPost();
        for (Post post : all) {
            System.out.println(post);
        }*/
    }
}
