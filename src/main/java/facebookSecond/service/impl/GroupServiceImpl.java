package facebookSecond.service.impl;

import facebookSecond.dao.GroupDao;
import facebookSecond.dao.impl.GroupDaoImpl;
import facebookSecond.model.Group;
import facebookSecond.service.GroupService;

import java.util.List;

public class GroupServiceImpl implements GroupService {

    @Override
    public List<Group> getAllGroups() {
        GroupDao groupDao = new GroupDaoImpl();
        return groupDao.getAllGroups();

    }

}
