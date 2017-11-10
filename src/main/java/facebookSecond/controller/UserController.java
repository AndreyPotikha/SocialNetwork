package facebookSecond.controller;

import facebookSecond.model.User;
import facebookSecond.service.UserService;

import java.util.List;

public class UserController {

    public static void main(String[] args) {
        UserService userService = new UserService();
        List<User> all = userService.getAll();
        for (User elem : all) {
            System.out.println(elem.getName());
        }
    }
}
