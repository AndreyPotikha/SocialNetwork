package facebookSecond.controller;


import facebookSecond.model.Group;
import facebookSecond.model.Post;
import facebookSecond.service.GroupService;
import facebookSecond.service.PostService;
import facebookSecond.service.impl.GroupServiceImpl;
import facebookSecond.service.impl.PostServiceImpl;

import java.util.List;

public class GroupController {

    public static void main(String[] args) {

        Group group1 = new Group();
        group1.setFollowrs("50");

        GroupService groupService = new GroupServiceImpl();
        groupService.update(group1);
        groupService.creat(group1);
        groupService.del(1L);


        GroupService service = new GroupServiceImpl();
        List<Group> groups = service.getAllGroups();

        for (Group group : groups) {
            System.out.println(group);
        }

    }
}
