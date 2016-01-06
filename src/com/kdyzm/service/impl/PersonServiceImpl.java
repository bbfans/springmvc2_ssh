package com.kdyzm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kdyzm.dao.base.BaseDao;
import com.kdyzm.domain.Person;
import com.kdyzm.service.PersonService;
import com.kdyzm.service.base.impl.BaseServiceImpl;

@Service("personService")
public class PersonServiceImpl extends BaseServiceImpl<Person> implements PersonService {
	@Resource(name = "personDao")
	@Override
	public void setBaseDao(BaseDao<Person> baseDao) {
		super.setBaseDao(baseDao);
	}
}
