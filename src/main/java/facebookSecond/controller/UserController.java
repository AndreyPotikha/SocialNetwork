package facebookSecond.controller;

import facebookSecond.model.User;
import facebookSecond.service.UserService;
import facebookSecond.service.impl.UserServiceImpl;

import java.util.List;

public class UserController {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        List<User> all = userService.getAllUser();
        for (User elem : all) {
            System.out.println(elem.getName());
        }
    }
}
