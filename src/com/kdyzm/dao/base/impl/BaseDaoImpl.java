package com.kdyzm.dao.base.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;

import com.kdyzm.dao.base.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T> {
	/**
	 * 在构造方法中获取真实的参数类型
	 */
	private Class<T> clazz;
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class<T>) parameterizedType.getActualTypeArguments()[0];
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
		this.sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public void deleteEntity(T t) {
		this.sessionFactory.getCurrentSession().delete(t);
	}

	@Override
	public void saveEntity(T t) {
		this.sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public T getEntityById(Serializable id) {
		return (T) this.sessionFactory.getCurrentSession().get(clazz, id);
	}

	@Override
	public Collection<T> findAllEntities() {
		String name = this.clazz.getSimpleName();
		String hql = "from " + name;
		return this.sessionFactory.getCurrentSession().createQuery(hql).list();
	}

	@Override
	public void batchEntitiesByHql(String hql, Object... parameters) {
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		for (int i = 0; i < parameters.length; i++) {
			query.setParameter(i, parameters[i]);
		}
		query.executeUpdate();
	}

	@Override
	public void batchEntitiesBySql(String sql, Object... parameters) {
		SQLQuery sqlQuery = this.sessionFactory.getCurrentSession().createSQLQuery(sql);
		for (int i = 0; i < parameters.length; i++) {
			sqlQuery.setParameter(i, parameters[i]);
		}
		sqlQuery.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> findEntitiesByHql(String hql, Object... parameters) {
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		for (int i = 0; i < parameters.length; i++) {
			query.setParameter(i, parameters[i]);
		}
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> findEntitiesBySql(String sql, Object... parameters) {
		SQLQuery sqlQuery = this.sessionFactory.getCurrentSession().createSQLQuery(sql);
		for (int i = 0; i < parameters.length; i++) {
			sqlQuery.setParameter(i, parameters[i]);
		}
		return sqlQuery.list();
	}

}
