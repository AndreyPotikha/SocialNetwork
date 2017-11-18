package facebookSecond.service.impl;

import facebookSecond.dao.PostDao;
import facebookSecond.dao.factory.DaoFactory;
import facebookSecond.dao.impl.PostDaoImpl;
import facebookSecond.data.Database;
import facebookSecond.model.Post;
import facebookSecond.service.PostService;

import java.time.LocalDate;
import java.util.List;

public class PostServiceImpl implements PostService{

    @Override
    public List<Post> getAllPost() {
        PostDao postDao = DaoFactory.getPostDao();
        return postDao.getAllPost();

        /*PostDao postDao = new PostDaoImpl();
        return postDao.getAllPost();*/
    }

    @Override
    public Post findByTitle(String title) {
        if (title == null) {
            return null;
        }
        return DaoFactory.getPostDao().findByTitle(title);
    }

    @Override
    public List<Post> findByData(LocalDate date) {
        if (date == null) {
            return null;
        }
        return DaoFactory.getPostDao().findByDate(date);
    }
}
