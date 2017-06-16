package com.niit.laptoptreasurebackend;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.laptoptreasurebackend.dao.CategoryDAO;
import com.niit.laptoptreasurebackend.model.Category;

public class CategoryTestCase 
{
	public static void main(String args[])
	{

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.laptoptreasurebackend");
		context.refresh();
		
		
		//Inserting a Category object
		CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
		//Inserting Test Case
		Category category=new Category();
		category.setCatname("Lenovo laptop");
		category.setCatdesc("The laptop is enabled with Lenovo");
		
		categoryDAO.insertUpdateCategory(category);
		System.out.println("Category Inserted");
		
		
	}

}
