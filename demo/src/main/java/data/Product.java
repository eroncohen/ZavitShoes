package data;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;



public class Product {
	
	@Id
	private int id;
	private String name;
	private String description;
	private double price;
	private String color;
	private ArrayList<String> images;
	
	public Product(int id, String name, String description, double price, String color) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ArrayList<String> getImages() {
		return images;
	}
	public void setImages(ArrayList<String> images) {
		this.images = images;
	}
}
