package facebookSecond.service;

import facebookSecond.model.AbstactEntity;
import facebookSecond.model.Group;

public interface CrudService<T extends AbstactEntity> {

    void creat(T entity);

    void update(T entity);

    void del(Long idGroup);
}
