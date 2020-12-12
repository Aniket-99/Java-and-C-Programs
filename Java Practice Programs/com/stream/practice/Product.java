package com.stream.practice;

public class Product {
	public int productId;
	public String name;
	public double price;
	public String category;
	public int reorderlevel;

	public Product(int productId, String name, double price, String category, int reorderlevel) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.category = category;
		this.reorderlevel = reorderlevel;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReorderlevel() {
		return reorderlevel;
	}

	public void setReorderlevel(int reorderlevel) {
		this.reorderlevel = reorderlevel;
	}
	
	

}
