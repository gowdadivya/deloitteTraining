package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDAO;

	public void setproductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	@Transactional
	public void addProduct(Product p) {
		this.productDAO.save(p);
	}

	@Override
	@Transactional
	public void updateProduct(Product p) {
		this.productDAO.save(p);
	}

	@Override
	@Transactional
	public List<Product> listProducts() {
		return (List<Product>) this.productDAO.findAll();
	}

	@Override
	@Transactional
	public Product getProductById(Integer productId) {
		Optional<Product> product = this.productDAO.findById(productId);
		if(product.isPresent())
		{
			return product.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	@Transactional
	public void removeProduct(int productId) {
		((ProductServiceImpl) productDAO).removeProduct(productId);
	}

}