package facebookSecond.dao.impl;

import facebookSecond.model.AbstactEntity;
import facebookSecond.model.Group;

public interface CrudDao<T extends AbstactEntity> {

    void creat(T entity);

    void update(T entity);

    void del(Long idGroup);
}
