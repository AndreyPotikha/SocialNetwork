package facebookSecond.controller;

import facebookSecond.model.User;
import facebookSecond.service.UserService;
import facebookSecond.service.factory.ServiceFactory;
import facebookSecond.service.impl.UserServiceImpl;

import java.util.List;

public class UserController {

    public static void main(String[] args) {

        UserService userName = ServiceFactory.getUserService();
        User name = userName.getByName("Alex");
        System.out.println(name);


        /*UserService userService = ServiceFactory.getUserService();
        List<User> allUser = userService.getAllUser();
        for (User user : allUser) {
            System.out.println(user.getName());*/
        }
       /* UserService userService = new UserServiceImpl();
        List<User> all = userService.getAllUser();
        for (User elem : all) {
            System.out.println(elem.getName());
        }*/

}
