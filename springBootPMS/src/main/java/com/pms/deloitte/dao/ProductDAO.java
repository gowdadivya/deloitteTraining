package com.pms.deloitte.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pms.deloitte.model.Product;

public interface ProductDAO extends CrudRepository<Product, Integer>{
	public List<Product> findByProductName(String productName);
	public List<Product> findByPrice(int price);
	public List<Product> findByPriceBetween(Integer minimum, Integer maximum);
	public List<Product> findByQuantityGreaterThan(Integer quantity);
	
}
