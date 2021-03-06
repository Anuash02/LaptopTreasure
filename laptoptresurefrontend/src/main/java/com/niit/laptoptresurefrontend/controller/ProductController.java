package com.niit.laptoptresurefrontend.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.laptoptreasurebackend.dao.CategoryDAO;
import com.niit.laptoptreasurebackend.dao.ProductDAO;
import com.niit.laptoptreasurebackend.model.Category;
import com.niit.laptoptreasurebackend.model.Product;

@Controller
public class ProductController 
{
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/Product")
	public String showProduct(Model m)
	{
		List<Category> list=categoryDAO.getCategoryDetails();
		LinkedHashMap<Integer,String> catlist=new LinkedHashMap<Integer,String>();
		
		for(Category cat:list)
		{
			catlist.put(cat.getCatid(), cat.getCatname());
		}
		
		Product product=new Product();
		m.addAttribute("catlist",catlist);
		m.addAttribute("product",product);
        return "Product";
	}
	
	
	@RequestMapping(value="/InsertProduct",method=RequestMethod.POST)
	public String insertProduct(@ModelAttribute("product") Product product, BindingResult result, Model m)
	{
		System.out.println("---Product Inserted-----");
        productDAO.insertUpdateProduct(product);
        List<Product> prodlist=productDAO.getProductDetails();
        m.addAttribute("prodlist",prodlist);
		return "Product";
	}
	
	public String updateProduct(@PathVariable("prodid")int prodid,Model m)
	{

		Product product=productDAO.getProduct(prodid);
		m.addAttribute("product",product);
		return "Product";
	}
			
}
