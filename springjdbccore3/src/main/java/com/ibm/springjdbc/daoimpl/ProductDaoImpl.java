package com.ibm.springjdbc.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ibm.springjdbc.beans.Product;
import com.ibm.springjdbc.dao.ProductDao;
import com.ibm.springjdbc.daoimpl.ProductRowMapper;
@Repository

public class ProductDaoImpl implements ProductDao{
	@Autowired
	
	private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public void createProduct(Product product) {
		// TODO Auto-generated method stub
		String sql="insert into product values(?,?,?,?)";
		jdbcTemplate.update(sql,product.getPid(),product.getPname(),product.getCost(),product.getQuantity());
		
	}

	public void updateProductCostByPid(double cost, int pid) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update product set cost=? where pid=?",cost,pid);
		
	}

	public void deleteProductById(int pid) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete product where pid=?",pid);
		
	}

	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from product where pid=?",new ProductRowMapper(),pid);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from product", new ProductRowMapper());
	}

	public Product getProuctByCost(double cost) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from product where cost=?", new ProductRowMapper(),cost);
	}

}
