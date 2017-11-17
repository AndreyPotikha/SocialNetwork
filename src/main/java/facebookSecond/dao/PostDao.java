package facebookSecond.dao;

import facebookSecond.model.Post;
import javafx.geometry.Pos;

import java.time.LocalDate;
import java.util.List;

public interface PostDao {

    List<Post> getAllPost();

    Post findByTitle(String title);

    Post findByDate(LocalDate date);
}
