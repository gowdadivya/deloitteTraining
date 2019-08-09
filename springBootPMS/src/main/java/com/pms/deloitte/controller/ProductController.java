package com.pms.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Controller
public class ProductController {
	

	@Autowired
	private ProductService productService;
	

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String listProducts(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("listProducts", this.productService.listProducts());
		return "product";
	}
	
	//For add and update product both
	@RequestMapping(value= "/product/add", method = RequestMethod.POST)
	public String addproduct(@ModelAttribute("product") Product p){
		System.out.println("#####product :"+p);
			this.productService.addProduct(p);
		return "redirect:/products";
	}

	@RequestMapping(value= "/edit/add/update", method = RequestMethod.POST)
	public String updateproduct(@ModelAttribute("product") Product p){
		System.out.println("#####product updating :"+p);
			this.productService.updateProduct(p);
		return "redirect:/products";
	}
	
	
	@RequestMapping("/remove/{id}")
    public String removeproduct(@PathVariable("id") int productId){
		
        this.productService.removeProduct(productId);
        return "redirect:/products";
    }
 
    @RequestMapping("/edit/{id}")
    public String editproduct(@PathVariable("id") int productId, Model model){
        model.addAttribute("product", this.productService.getProductById(productId));
        model.addAttribute("listProducts", this.productService.listProducts());
        return "product";
    }
}
