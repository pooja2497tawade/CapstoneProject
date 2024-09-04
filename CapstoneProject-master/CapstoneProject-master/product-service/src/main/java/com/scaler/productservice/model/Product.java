package com.scaler.productservice.model;


public class Product {

    private Long id;
    private String title;
    private String name;
    private double price;
    private Category category;
    private String description;
    private String imageUrl;
    
    
	public Product(Long id, String title, double price, Category category, String description, String imageUrl) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.category = category;
		this.description = description;
		this.imageUrl = imageUrl;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
