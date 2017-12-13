package facebookSecond.service.impl;

import facebookSecond.dao.GroupDao;
import facebookSecond.dao.PostDao;
import facebookSecond.dao.factory.DaoFactory;
import facebookSecond.dao.impl.GroupDaoImpl;
import facebookSecond.dao.impl.PostDaoImpl;
import facebookSecond.model.Group;
import facebookSecond.service.GroupService;

import java.util.List;

public class GroupServiceImpl implements GroupService {

    @Override
    public List<Group> getAllGroups() {
        GroupDao groupDao = DaoFactory.getGroupDao();
        return groupDao.getAllGroups();

      /*  GroupDao groupDao = new GroupDaoImpl();
        return groupDao.getAllGroups();*/

    }

    @Override
    public void creat(Group group) {
        GroupDao groupDao = new GroupDaoImpl();
       groupDao.creat(group);
    }

    @Override
    public void update(Group group) {
        GroupDao groupDao = new GroupDaoImpl();
        groupDao.update(group);

    }

    @Override
    public void del(Long idGroup) {
        GroupDao groupDao = new GroupDaoImpl();
        groupDao.del(idGroup);
    }

}
