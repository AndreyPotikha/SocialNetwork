package facebookSecond.controller;

import facebookSecond.model.Post;
import facebookSecond.service.PostService;
import facebookSecond.service.UserService;
import facebookSecond.service.impl.PostServiceImpl;

import java.time.LocalDate;
import java.util.List;

public class PostController {

    public static void main(String[] args) {
//      Search by title
        PostService postTitle = new PostServiceImpl();
        Post post = postTitle.findByTitle("football");
        System.out.println(post);

//      Search by data
        PostService postData = new PostServiceImpl();
        List<Post> data = postTitle.findByData(LocalDate.of(2017, 11, 15));
        System.out.println(data);
        System.out.println();
       /* PostService postService = new PostServiceImpl();
        List<Post> all = postService.getAllPost();
        for (Post post : all) {
            System.out.println(post);
        }*/
    }
}
