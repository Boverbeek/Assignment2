package com.mgg;

public class Product {
	private String code;
	private String type;
	private String name;
	private double basePrice;
	
	public Product (String code, String type, String name, double basePrice) {
		this.code = code;
		this.type = type;
		this.name = name;
		this.basePrice = basePrice;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getCode() {
		return code;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public double getBasePrice() {
		return basePrice;
	}
	
}
