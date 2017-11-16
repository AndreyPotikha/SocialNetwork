package facebookSecond.dao.factory;

import facebookSecond.dao.GroupDao;
import facebookSecond.dao.PostDao;
import facebookSecond.dao.UserDao;
import facebookSecond.dao.impl.GroupDaoImpl;
import facebookSecond.dao.impl.PostDaoImpl;
import facebookSecond.dao.impl.UserDaoImpl;
import facebookSecond.service.impl.UserServiceImpl;

public class DaoFactory {

    /**
     * @return instance of {@link UserDaoImpl}
     */
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }

    /**
     * @return instance of {@link PostDaoImpl}
     */
    public static PostDao getPostDao() {
        return new PostDaoImpl();
    }

    /**
     * @return instance of {@link GroupDaoImpl}
     */
    public static GroupDao getGroupDao() {
        return new GroupDaoImpl();
    }


}
