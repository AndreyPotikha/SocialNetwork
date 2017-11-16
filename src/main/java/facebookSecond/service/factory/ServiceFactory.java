package facebookSecond.service.factory;

import facebookSecond.service.GroupService;
import facebookSecond.service.PostService;
import facebookSecond.service.UserService;
import facebookSecond.service.impl.GroupServiceImpl;
import facebookSecond.service.impl.PostServiceImpl;
import facebookSecond.service.impl.UserServiceImpl;

public class ServiceFactory {

    /**
     * @return instance of {@link UserServiceImpl}
     */
    public static UserService getUserService() {
        return new UserServiceImpl();
    }

    /**
     * @return instance of {@link PostServiceImpl}
     */
    public static PostService getPostService() {
        return new PostServiceImpl();
    }

    /**
     * @return instance of {@link GroupServiceImpl}
     */
    public static GroupService getGroupService() {
        return new GroupServiceImpl();
    }


}
