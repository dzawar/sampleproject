package com.ibm.springjdbc.service;

import java.util.List;

import com.ibm.springjdbc.beans.Product;

public interface ProductService {
	
	public void addProduct(Product product);
	public void editProductCostByPid(double cost,int pid);
	public void removeProductById(int pid);
	public Product fetchProductById(int pid);
	public List<Product> fetchAllProducts();
	public Product fetchProuctByCost(double cost);
	

}
