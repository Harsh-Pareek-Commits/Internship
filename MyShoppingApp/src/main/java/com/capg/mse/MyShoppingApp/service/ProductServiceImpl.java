package com.capg.mse.MyShoppingApp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.mse.MyShoppingApp.bean.Product;
import com.capg.mse.MyShoppingApp.dao.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository repo;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	@Transactional
	public Product saveProduct(Product p) {
		// TODO Auto-generated method stub
		
		repo.save(p);
		return p;
	}

}
