package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import dao.rdb.ProductCrud;
import dao.rdb.RdbProductDao;
import data.Product;
import data.Shoes;

//@Profile("production")
@Component
public class ProductDemo implements CommandLineRunner{
	//private RdbProductDao repository;
	private ProductCrud repository;
	
	@Autowired
	public ProductDemo(ProductCrud dao) {
		repository = dao;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		System.err.println("Hello World!");
		Product p1 = new Shoes(1, "Republic", "This shoe is awsome", 199.9, "black");
		Map<Integer, Integer> stock = new HashMap<Integer, Integer>();
		stock.put(36, 1);
		stock.put(37, 2);
		stock.put(38, 0);
		stock.put(39, 1);
		((Shoes) p1).setStock(stock);
		System.err.println(p1.getDescription());
		//System.out.println(repository.create(p1));
		System.out.println(repository.save(p1));
		
	}
	
}
