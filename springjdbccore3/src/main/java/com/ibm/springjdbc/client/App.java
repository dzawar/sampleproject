package com.ibm.springjdbc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.springjdbc.beans.Product;
import com.ibm.springjdbc.service.ProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
    	ProductService ps=(ProductService) context.getBean("pservice");
    	//Product p=(Product) context.getBean("product");
    	Product p=new Product();
    	p.setPid(12);
    	p.setPname("headphones");
    	p.setCost(500.00);
    	p.setQuantity(2);
    	ps.addProduct(p);
    	 System.out.println( "Done.." );
    }
}
