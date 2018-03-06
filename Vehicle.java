package com.colinilgen.samsautosuclafinal;

public abstract class Vehicle implements Comparable<Vehicle>{
	 private int inventoryID;
	 private String carMake;
	 private String model;
	 private String year;
	 private String purchaseDate; 
	 private String saleDate;  
	 private double buyingPrice; 
	 private double sellingPrice;
	

	public Vehicle(int inventoryID, String carMake, String model, String year, String purchaseDate,
			String saleDate, double buyingPrice, double sellingPrice) {
		this.inventoryID = inventoryID;
		this.carMake = carMake;
		this.model = model;
		this.year = year;
		this.purchaseDate = purchaseDate;
		this.saleDate = saleDate;
		this.buyingPrice = buyingPrice;
		this.sellingPrice = sellingPrice;
	}

	public int getInventoryID() {
		return inventoryID;
	}

	public void setInventoryID(int inventoryID) {
		this.inventoryID = inventoryID;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getStartingDate() {
		return purchaseDate;
	}

	public void setStartingDate(String startingDate) {
		this.purchaseDate = startingDate;
	}

	public String getSellingDate() {
		return saleDate;
	}

	public void setSellingDate(String saleDate) {
		this.saleDate = saleDate;
	}

	public double getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}
	
}
