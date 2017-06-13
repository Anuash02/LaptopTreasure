package com.niit.laptoptreasurebackend.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryDAO 
{
	@Autowired
	SessionFactory sessionFactory;
     
	public CategoryDAO(SessionFactory sessionFactory)
	{
       this.sessionFactory=sessionFactory;
	}
}
