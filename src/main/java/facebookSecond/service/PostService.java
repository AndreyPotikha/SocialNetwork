package facebookSecond.service;

import facebookSecond.model.Post;
import facebookSecond.model.User;
import javafx.geometry.Pos;

import java.time.LocalDate;
import java.util.List;

public interface PostService  extends CrudService<Post>{

    List<Post> getAllPost();

    List<Post> findByTitle(String title);

    List<Post> findByData(LocalDate date);
}
