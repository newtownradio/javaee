package com.colinilgen.samsautosuclafinal;

public class Truck extends Vehicle {
	private int numberOfWheels; 

	public Truck(int inventoryID, String carMake, String model, String year, String startingDate,
			String sellingDate, int buyingPrice, int sellingPrice, int numberOfWheels) {
		super(inventoryID, carMake, model, year, startingDate, sellingDate, buyingPrice, sellingPrice);
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public String toString() {
		return "Truck [getNumberOfWheels()=" + getNumberOfWheels()
				+ ", getInventoryID()=" + getInventoryID() + ", getCarMake()=" + getCarMake() + ", getModel()="
				+ getModel() + ", getYear()=" + getYear() + ", getStartingDate()=" + getStartingDate()
				+ ", getSellingDate()=" + getSellingDate() + ", getBuyingPrice()=" + getBuyingPrice()
				+ ", getSellingPrice()=" + getSellingPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public int compareTo(Vehicle o) {
		return 0;
	}

}
