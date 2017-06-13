package com.niit.laptoptreasurebackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;



@Configuration
@ComponentScan("com.niit.laptoptreasurebackend")

public class DBConfig
{
	   @Bean(name="dataSource")
	  public DataSource getDataSource()
	  {

		   DriverManagerDataSource dataSource = new DriverManagerDataSource();
		   dataSource.setDriverClassName("org.h2.Driver");
		   dataSource.setUrl("jdbc:h2:~/database");
		   dataSource.setUsername("sa");
		   dataSource.setPassword("anuash02");
		   return dataSource;
	  }
	   
	   @Bean(name="sessionFactory")
	   public SessionFactory getSessionFactory()
	   {

		   Properties properties=new Properties();
		   properties.setProperty("hibernate.hbm2ddl.auto", "update");
		   properties.put("hibernate.show_sql", "true");
		   properties.put("hibernate.dialect", "org.hibernate.dialect.h2dialect");
		   
		   
		   LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(getDataSource());
		   sessionBuilder.setProperties(properties);
		   return sessionBuilder.buildSessionFactory();
	   }
       
	   @Bean(name="txManager")
	   public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	   {

		   HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
				   return transactionManager;
	   }
}
