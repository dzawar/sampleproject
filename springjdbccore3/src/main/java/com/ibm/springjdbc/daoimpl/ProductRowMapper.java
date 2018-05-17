package com.ibm.springjdbc.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibm.springjdbc.beans.Product;

public class ProductRowMapper implements RowMapper<Product>{

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setPid(rs.getInt("pid"));
		p.setPname(rs.getString("pname"));
		p.setCost(rs.getDouble("cost"));
		p.setQuantity(rs.getInt("quantity"));
		return p; 
	}

}
