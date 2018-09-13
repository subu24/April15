package com.he.shoppingCart;

public class Product {
	private String name;
	private Double price;
	
	
	public Product(String name, Double price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
	    if (!(obj instanceof Product))
	        return false;
	    if (obj == this)
	        return true;
	    if(this.getName().equalsIgnoreCase(((Product)obj).getName()) && this.getPrice()==((Product)obj).getPrice())
		return true;
		
		return false;
		
	}
	
}
