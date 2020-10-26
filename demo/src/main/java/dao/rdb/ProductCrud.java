package dao.rdb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import data.Product;

@Repository
public interface ProductCrud extends MongoRepository<Product, Integer> {
	
}
