package com.pms.deloitte.service;

import java.util.List;


import com.pms.deloitte.model.Product;

public interface ProductService {
	public void addProduct(Product p);
	public void updateProduct(Product p);
	public List<Product> listProducts();
	public Product getProductById(Integer  productId);
	public void removeProduct(int productId);

}
