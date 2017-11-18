package facebookSecond.controller;

import facebookSecond.model.User;
import facebookSecond.service.UserService;
import facebookSecond.service.factory.ServiceFactory;

import java.util.List;

public class UserController {

    public static void main(String[] args) {
//      Search by age
        UserService userAge = ServiceFactory.getUserService();
        List<User> age = userAge.findByAge(40);
        System.out.println(age);

//        Search by surname
        UserService userSurname = ServiceFactory.getUserService();
        List<User> surname = userSurname.findBySurname("Smith");
        System.out.println(surname);

//        Search by name
        UserService userName = ServiceFactory.getUserService();
        List<User> name = userName.findByName("Alex");
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
