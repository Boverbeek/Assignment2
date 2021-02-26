package com.mgg;

public class Subscriptions {
	private String code;
	private String SB;
	private String name;
	private double annualFee;

	public Subscriptions (String code, String SB, String name, double annualFee) {
		this.code = code;
		this.SB = SB;
		this.name = name;
		this.annualFee = annualFee;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setSB(String sB) {
		SB = sB;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAnnualFee(double annualFee) {
		this.annualFee = annualFee;
	}

	public String getCode() {
		return code;
	}

	public String getSB() {
		return SB;
	}

	public String getName() {
		return name;
	}

	public double getAnnualFee() {
		return annualFee;
	}
	
}
