package com.niit.laptoptreasurebackend.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.laptoptreasurebackend.model.*;


@Repository("categoryDAO")
public class CategoryDAO 
{
	@Autowired
	SessionFactory sessionFactory;
     
	public CategoryDAO(SessionFactory sessionFactory)
	{
       this.sessionFactory=sessionFactory;
	}
	
    @Transactional
	public void insertUpdateCategory(Category category)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(category);
	}
    public Category getCategory(int catid)
    {

    	Session session= sessionFactory.openSession();
    	Category category=(Category)session.get(Category.class,catid);
    	session.close();
    	return category;
    }
}
