package facebookSecond.controller;

import facebookSecond.model.Post;
import facebookSecond.service.PostService;

import java.util.List;

public class PostController {

    public static void main(String[] args) {

        PostService postService = new PostService();
        List<Post> all = postService.getAllPost();
        for (Post post : all) {
            System.out.println(post);
        }
    }
}
