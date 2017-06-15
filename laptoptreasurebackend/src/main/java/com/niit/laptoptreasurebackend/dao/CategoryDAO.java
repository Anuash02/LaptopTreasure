package com.niit.laptoptreasurebackend.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.laptoptreasurebackend.model.*;



public class CategoryDAO 
{
	@Autowired
	SessionFactory sessionFactory;
     
	public CategoryDAO(SessionFactory sessionFactory)
	{
       this.sessionFactory=sessionFactory;
	}
	
	public void insertCategory(Category category)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}
}
