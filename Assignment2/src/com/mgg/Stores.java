package com.mgg;

public class Stores {

	private String storeCode;
	private String managerCode;
	private Address address;

	public Stores (String storeCode, String managerCode, Address address) {
		this.storeCode = storeCode;
		this.managerCode = managerCode;
		this.address = address;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public String getManagerCode() {
		return managerCode;
	}

	public Address getAddress() {
		return address;
	}
	
}
