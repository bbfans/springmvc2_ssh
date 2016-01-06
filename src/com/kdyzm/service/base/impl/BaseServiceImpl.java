package com.kdyzm.service.base.impl;

import java.io.Serializable;
import java.util.Collection;

import com.kdyzm.dao.base.BaseDao;
import com.kdyzm.service.base.BaseService;

public class BaseServiceImpl<T> implements BaseService<T>{
	private BaseDao<T> baseDao;
	/**
	 * 通过构造方法给BaseDao传递参数
	 * @return
	 */
	public BaseDao<T> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void createEntity(T t) {
		this.saveEntity(t);
	}

	@Override
	public void newEntity(T t) {
		this.saveEntity(t);
	}

	@Override
	public void updateEntity(T t) {
		this.baseDao.updateEntity(t);
	}

	@Override
	public void deleteEntity(T t) {
		this.baseDao.deleteEntity(t);
	}

	@Override
	public void saveEntity(T t) {
		this.baseDao.saveEntity(t);
	}

	@Override
	public void batchEntitiesByHql(String hql, Object... parameters) {
		this.baseDao.batchEntitiesByHql(hql, parameters);
	}

	@Override
	public void batchEntitiesBySql(String sql, Object... parameters) {
		this.baseDao.batchEntitiesBySql(sql, parameters);
	}

	@Override
	public T getEntityById(Serializable id) {
		return this.baseDao.getEntityById(id);
	}

	@Override
	public Collection<T> findAllEntities() {
		return this.baseDao.findAllEntities();
	}

	@Override
	public Collection<T> findEntitiesByHql(String hql, Object... parameters) {
		return this.baseDao.findEntitiesByHql(hql, parameters);
	}

	@Override
	public Collection<T> findEntitiesBySql(String sql, Object... parameters) {
		return this.baseDao.findEntitiesBySql(sql, parameters);
	}
	
}
