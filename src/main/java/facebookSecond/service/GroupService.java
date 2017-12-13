package facebookSecond.service;

import facebookSecond.model.Group;
import facebookSecond.model.Post;
import facebookSecond.model.User;

import java.util.List;

public interface GroupService  extends CrudService<Group>{

    List<Group> getAllGroups();

}
