package com.ibm.springjdbc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springjdbc.beans.Product;
import com.ibm.springjdbc.dao.ProductDao;
import com.ibm.springjdbc.service.ProductService;
@Service("pservice")

public class ProductServiceImpl implements ProductService{
	@Autowired
	
	private ProductDao productDao;
	

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.createProduct(product);
	}

	public void editProductCostByPid(double cost, int pid) {
		// TODO Auto-generated method stub
		productDao.updateProductCostByPid(cost, pid);
	}

	public void removeProductById(int pid) {
		// TODO Auto-generated method stub
		productDao.deleteProductById(pid);
	}

	public Product fetchProductById(int pid) {
		// TODO Auto-generated method stub
		return productDao.getProductById(pid);
	}

	public List<Product> fetchAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	public Product fetchProuctByCost(double cost) {
		// TODO Auto-generated method stub
		return productDao.getProuctByCost(cost);
	}
	
	

}
