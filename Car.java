package com.colinilgen.samsautosuclafinal;


public class Car extends Vehicle {
	private int numberOfDoors;
	 
	
	public Car(int inventoryID, String carMake, String model, String year, String purchaseDate,
			String saleDate, int buyingPrice, int sellingPrice, int numberOfDoors) {
		super(inventoryID, carMake, model, year, purchaseDate, saleDate, buyingPrice, sellingPrice);
		this.setNumberOfDoors(numberOfDoors);
	}

	@Override
	public String toString() {
		return "Car [getNumberOfDoors()=" + getNumberOfDoors()
				+ ", getInventoryID()=" + getInventoryID() + ", getCarMake()=" + getCarMake() + ", getModel()="
				+ getModel() + ", getYear()=" + getYear() + ", getStartingDate()=" + getStartingDate()
				+ ", getSellingDate()=" + getSellingDate() + ", getBuyingPrice()=" + getBuyingPrice()
				+ ", getSellingPrice()=" + getSellingPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;   	
    }
	@Override
	public int compareTo(Vehicle o) {
		return 0;
	}
	
    }
