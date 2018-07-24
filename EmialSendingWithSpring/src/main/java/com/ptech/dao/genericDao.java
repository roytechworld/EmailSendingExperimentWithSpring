package com.ptech.dao;

import java.util.List;

import org.hibernate.Session;

public interface genericDao<T> {
	
	public boolean save(T entity );
	public List<T> getListvalue(T c,Session s, String quey);
	public <T> List<T> magicalListGetter(Session s, String quey);
	
	public <T> List<T> anyTypeofListReturnEngine(Session s,String query);
	public <T> T anyClassTypeReturnEngine(Session s,String query,T t);
	
	public <T> List<T> getAnyList(Session session,String query);
	
	

}
