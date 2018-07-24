package com.ptech.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptech.dao.genericDao;
@Service
public class GenericServiceDaoImpl<T> implements GenericServiceDao<T> {
	
	public static final Logger log=LoggerFactory.getLogger(GenericServiceDaoImpl.class);
	
	@Autowired
	genericDao<T> genobj;
	

	@Override
	public boolean save(T obj) {
		// TODO Auto-generated method stub
		return genobj.save(obj);
	}

}
