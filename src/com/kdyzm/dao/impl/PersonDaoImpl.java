package com.kdyzm.dao.impl;

import org.springframework.stereotype.Repository;

import com.kdyzm.dao.PersonDao;
import com.kdyzm.dao.base.impl.BaseDaoImpl;
import com.kdyzm.domain.Person;
@Repository("personDao")
public class PersonDaoImpl extends BaseDaoImpl<Person> implements PersonDao{
	
}
