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

}
