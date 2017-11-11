package facebookSecond.controller;

import facebookSecond.model.User;
import facebookSecond.service.UserService1;

import java.util.List;

public class UserController {

    public static void main(String[] args) {
        UserService1 userService = new UserService1();
        List<User> all = userService.getAll();
        for (User elem : all) {
            System.out.println(elem.getName());
        }
    }
}
