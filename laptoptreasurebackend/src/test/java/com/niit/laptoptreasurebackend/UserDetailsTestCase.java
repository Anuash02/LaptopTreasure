package com.niit.laptoptreasurebackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.laptoptreasurebackend.dao.UserDetailsDAO;
import com.niit.laptoptreasurebackend.model.UserDetails;

public class UserDetailsTestCase
{
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.laptoptreasurebackend");
		context.refresh();
		
		//Inserting a Supplier object
		 UserDetailsDAO userDetailsDAO=(UserDetailsDAO)context.getBean("userDetailsDAO");
		 
		//Inserting UserDetails test cases
			UserDetails userDetails=new UserDetails();
			//userDetails.setUsername("Shan12");
			 userDetails.setPassword("anuash02");
			 userDetails.setCustname("Shekhar");
			 userDetails.setRole("Purchase");
			 userDetails.setEmail("shekhar123@gmail.com");
			 userDetails.setAddress("Nagpur");
			 userDetails.setMobile("9422152788");
			 userDetailsDAO.insertUpdateUserDetails(userDetails);
			 System.out.println("UserDetails Created");
		 
		//Retrieval TestCase
			
			/*UserDetails userDetails=userDetailsDAO.getUserDetails("Pooja");
			System.out.println("UserDetails Password:"+userDetails.getPassword());
			System.out.println("UserDetails CustName:"+userDetails.getCustname());
			System.out.println("UserDetails Role:"+userDetails.getRole());
			System.out.println("UserDetails Email:"+userDetails.getEmail());
			System.out.println("UserDetails Address:"+userDetails.getAddress());
			System.out.println("UserDetails Mobile:"+userDetails.getMobile());*/
	}
		 

}
