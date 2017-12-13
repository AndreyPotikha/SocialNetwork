package facebookSecond.dao;

import facebookSecond.dao.impl.CrudDao;
import facebookSecond.model.Group;
import facebookSecond.model.Post;
import facebookSecond.model.User;
import javafx.geometry.Pos;

import java.time.LocalDate;
import java.util.List;

public interface PostDao extends CrudDao<Post> {

    List<Post> getAllPost();

    List<Post> findByTitle(String title);

    List<Post> findByDate(LocalDate date);
}
