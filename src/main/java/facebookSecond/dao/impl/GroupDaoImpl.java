package facebookSecond.dao.impl;

import facebookSecond.dao.GroupDao;
import facebookSecond.data.Database;
import facebookSecond.model.Group;

import java.util.List;

public class GroupDaoImpl implements GroupDao{
    @Override
    public List<Group> getAllGroups() {
        return Database.gettAllGroup();
    }

    @Override
    public void creat(Group group) {
        System.out.println(group.getFollowrs() + " created");
    }

    @Override
    public void update(Group group) {
        System.out.println(group.getFollowrs() + " update");
    }

    @Override
    public void del(Long idGroup) {
        System.out.println(idGroup + " deleted");
    }

}
