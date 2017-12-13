package facebookSecond.dao;

import facebookSecond.dao.impl.CrudDao;
import facebookSecond.model.Group;
import facebookSecond.model.Post;

import java.util.List;

public interface GroupDao extends CrudDao<Group>{

    List<Group> getAllGroups();

}
