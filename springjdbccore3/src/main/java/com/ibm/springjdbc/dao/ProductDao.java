package com.ibm.springjdbc.dao;

import java.util.List;

import com.ibm.springjdbc.beans.Product;

public interface ProductDao {

	public void createProduct(Product product);
	public void updateProductCostByPid(double cost,int pid);
	public void deleteProductById(int pid);
	public Product getProductById(int pid);
	public List<Product> getAllProducts();
	public Product getProuctByCost(double cost);
	
}
