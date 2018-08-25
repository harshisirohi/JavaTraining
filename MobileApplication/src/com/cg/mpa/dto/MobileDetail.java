package com.cg.mpa.dto;

public class MobileDetail {
	int mobileid;
	String name;
	int price;
	String quantity;
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "MobileDetail [mobileid=" + mobileid + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	public MobileDetail(int mobileid, String name, int price, String quantity) {
		super();
		this.mobileid = mobileid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public MobileDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
