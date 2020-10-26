package data;

import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Shoes")
public class Shoes extends Product {
	private Map<Integer,Integer> stock;

	public Shoes(int id, String name, String description, double price, String color) {
		super(id, name, description, price, color);
	}
	
	public Map<Integer, Integer> getStock() {
		return stock;
	}

	public void setStock(Map<Integer, Integer> stock) {
		this.stock = stock;
	}

	public int getStockOfSpecificSize(int size) {
		return stock.get(size);
	}
	
}
