package com.ptech.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ptech.dao.genericDao;


@Service
@Repository
public class genericDaoImpl<T> implements genericDao<T>{
public static final Logger log=LoggerFactory.getLogger(genericDaoImpl.class);
	@Autowired
	private SessionFactory session;
	
	@Transactional
	@Override
	public boolean save(T entity) {
		// TODO Auto-generated method stub
	boolean result=false;
	String id;
		try
		{
		
			
	   id=(String)this.session.getCurrentSession().save(entity);
	
	    log.info("id found : "+id);
	
		}
		catch(Exception e)
		{
			System.out.println("Excption occur" +e);
		}
		
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getListvalue(T c,Session s, String quey) 

	{
		
		List<T> listobj=new ArrayList<T>();
		try
		{
			Query qr=s.createQuery(quey);
			listobj=qr.list();	
			for(Object objecttype:listobj)
			{

		
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occur"+e);
		}

		return listobj;
	}
	
	
	public <T> List<T> magicalListGetter(Session s, String quey) {
	    
		
		List<T> listobj=new ArrayList<T>();
		
		try
		{
			Query qr=s.createQuery(quey);
			listobj=qr.list();	
		}
		catch(Exception e)
		{
			System.out.println("Exception occur"+e);
		}
		
		return listobj;
	}
	
	
	
	public <T> List<T> anyTypeofListReturnEngine(Session s,String query)
	{
		List<T> listobj=new ArrayList<T>();	
		try
		{
			Query qr=s.createQuery(query);
			listobj=qr.list();	
		}
		catch(Exception e)
		{
			System.out.println("Exception occur"+e);
		}
		
		return listobj;
	}
	
	
	public <T> T anyClassTypeReturnEngine(Session s,String query,T t)
	{
		T typeobje =null;
		try
		{
		typeobje=(T)s.createQuery(query).uniqueResult();
		}
		catch(Exception e)
		{
			System.out.println("Exception occur"+e);
		}
		return typeobje;
	}
	
	
	
	public <T> List<T> getAnyList(Session session,String query)
	{
		List<T> listobj=new ArrayList<T>();	
		try
		{
			Query qr=session.createQuery(query);
			listobj=qr.list();	
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occur"+e);
		}
		
		
		return listobj;
		
	}
	
	
	
}
			

