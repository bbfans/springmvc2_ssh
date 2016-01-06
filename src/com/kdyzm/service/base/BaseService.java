package com.kdyzm.service.base;

import java.io.Serializable;
import java.util.Collection;

public interface BaseService<T> {
	public void createEntity(T t);
	public void newEntity(T t);
	public void updateEntity(T t);
	public void deleteEntity(T t);
	public void saveEntity(T t);
	public void batchEntitiesByHql(String hql,Object ... parameters);
	public void batchEntitiesBySql(String sql,Object ... parameters);
	
	public T getEntityById(Serializable id);
	public Collection<T> findAllEntities();
	public Collection<T> findEntitiesByHql(String hql,Object ... parameters);
	public Collection<T> findEntitiesBySql(String sql,Object ... parameters);
}
