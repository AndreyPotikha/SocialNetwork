package facebookSecond.controller;


import facebookSecond.model.Group;
import facebookSecond.service.GroupService;
import facebookSecond.service.impl.GroupServiceImpl;

import java.util.List;

public class GroupController {

    public static void main(String[] args) {

        GroupService service = new GroupServiceImpl();
        List<Group> groups = service.getAllGroups();

        for (Group group : groups) {
            System.out.println(group);
        }

    }
}
