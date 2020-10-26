package dao;
import java.util.List;

import data.Product;
public interface ProductDao {
	
	public Product create(Product product);
	public List<Product> readAll(int size, int page);
}
