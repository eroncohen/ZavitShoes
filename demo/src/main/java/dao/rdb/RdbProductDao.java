package dao.rdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.ProductDao;
import data.Product;

//@Repository
public class RdbProductDao implements ProductDao {
	
	@Autowired
	private ProductCrud productCrud;

	@Override
	@Transactional(readOnly = true)
	public List<Product> readAll(int size, int page) {
		//List<Product> allProducts = this.productCrud.findAll(PageRequest.of(page, size)).getContent();
		List <Product> allProducts= null;// = this.productCrud.findAll();
		return allProducts;
		
	}

	@Override
	public Product create(Product product) {
		Product rv = this.productCrud.save(product);
		return rv;
	}
}
