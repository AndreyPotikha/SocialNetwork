package facebookSecond.service;

import facebookSecond.model.Post;
import javafx.geometry.Pos;

import java.time.LocalDate;
import java.util.List;

public interface PostService {

    List<Post> getAllPost();

    Post findByTitle(String title);

    Post findByData(LocalDate date);
}
