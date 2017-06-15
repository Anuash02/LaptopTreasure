package com.niit.laptoptreasurebackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import com.niit.laptoptreasurebackend.dao.CategoryDAO;
import com.niit.laptoptreasurebackend.model.Category;



@Configuration
@ComponentScan("com.niit.laptoptreasurebackend")

public class DBConfig
{      @Autowired
	   @Bean(name="dataSource")
	  public DataSource getH2DataSource()
	  {
           System.out.println("----Data Source Creation-----");
		   DriverManagerDataSource dataSource = new DriverManagerDataSource();
		   dataSource.setDriverClassName("org.h2.Driver");
		   dataSource.setUrl("jdbc:h2:tcp://localhost/~/database");
		   dataSource.setUsername("sa");
		   dataSource.setPassword("anuash02");
		   System.out.println("----Data Source Creation-----");
		   return dataSource;
	  }
	   @Autowired
	   @Bean(name="sessionFactory")
	   public SessionFactory getSessionFactory(DataSource dataSource)
	   {
           System.out.println("------Hibernate properties creation------");
		   Properties properties=new Properties();
		   properties.setProperty("hibernate.hbm2ddl.auto", "update");
		   properties.put("hibernate.show_sql", "true");
		   properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		   System.out.println("------Hibernate properties created------");
		   
		   System.out.println("------LacalSessionFactoryBuider object creation------");
		   LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
		   sessionBuilder.addProperties(properties);
		   System.out.println("------Factory Builder object created------");
		   sessionBuilder.addAnnotatedClass(Category.class);
		   
		   System.out.println("------Session Factory  object creation------");
		   SessionFactory sessionFactory=sessionBuilder.buildSessionFactory();
		   System.out.println("------Session factory object created------");
		   return sessionFactory;
		   //return sessionBuilder.buildSessionFactory();
	   }
	   
	   
       @Autowired
	   @Bean(name="txManager")
	   public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	   {

		   HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
				   return transactionManager;
	   }
       
       
	   @Autowired
	   @Bean(name="categoryDAO")
	   public CategoryDAO getCategoryDAO(SessionFactory sessionFactory)
	   {

		   return new CategoryDAO(sessionFactory);
	   }
}
