package facebookSecond.service.impl;

import facebookSecond.dao.PostDao;
import facebookSecond.dao.UserDao;
import facebookSecond.dao.factory.DaoFactory;
import facebookSecond.dao.impl.PostDaoImpl;
import facebookSecond.dao.impl.UserDaoImpl;
import facebookSecond.data.Database;
import facebookSecond.model.Post;
import facebookSecond.model.User;
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
    public List<Post> findByTitle(String title) {
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

    @Override
    public void creat(Post post) {
        PostDao postDao = new PostDaoImpl();
        postDao.creat(post);
    }

    @Override
    public void update(Post post) {
        PostDao postDao = new PostDaoImpl();
        postDao.update(post);
    }

    @Override
    public void del(Long idPost) {
        PostDao postDao = new PostDaoImpl();
        postDao.del(idPost);
    }


}
