package com.colinilgen.samsautosuclafinal;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	private static double totalCarSales;
	private static double totalTruckSales;
	private static double carNetProfit;
	private static double truckNetProfit; 

	public static void main(String[] args) {
				
		Car aCar = new Car(1, "Ford", "Crown Victoria", "2010", "7/03/2012", "7/23/2012", 8900,14000, 4); 
		Car bCar = new Car(2, "Toyota", "Camry", "2009", "7/23/2012", "7/27/2012", 7600, 17500, 4);
		Truck aTruck = new Truck(3, "Ford", "F-150", "2010", "7/21/2012", "7/29/2012", 17600, 27500, 4);
		Truck bTruck = new Truck(7, "Ford", "F-450", "2010", "7/14/2012", "7/30/2012", 17600, 39500, 6);
        Truck cTruck = new Truck(4, "GMC", "Sierra 1500", "2009", "7/2/2012", "7/24/2012", 11600, 19500, 4);
        Car cCar = new Car(5, "Dodge", "Caravan", "2009", "7/7/2012", "7/18/2012", 2600, 9500, 4);
        Car dCar = new Car(6, "Ford", "Mustang", "2009", "7/14/2012", "8/23/2012", 12600, 25600, 2);
		 
		   ArrayList <Car> carsList = new ArrayList<>();
		   carsList.add(aCar);
		   carsList.add(bCar);
		   carsList.add(cCar);
		   carsList.add(dCar);
		   
		   ArrayList <Truck> trucksList = new ArrayList<>(); 
		   trucksList.add(aTruck);
		   trucksList.add(bTruck);
		   trucksList.add(cTruck);

		   System.out.println("CAR DATA DUMP");
		   
		   for (Car x: carsList) {
			   System.out.println(x.toString());
		   }	   
		
		   System.out.println("TRUCK DATA DUMP");
		   
		   for (Truck y: trucksList) {
			   System.out.println(y.toString());
		   }
		   
		   System.out.println("CARS BY DATE SOLD");
		   
		   Collections.sort(carsList, (carOne, carTwo) -> carOne.getSellingDate().compareTo(carTwo.getSellingDate()));
		   
		   for (Car x: carsList) {
			   System.out.println(x.toString());
		   }
		   System.out.println("CARS BY MAKE");
		   
		   Collections.sort(carsList, (carOne, carTwo) -> carOne.getCarMake().compareTo(carTwo.getCarMake()));
		   
		   for (Car x: carsList) {
			   System.out.println(x.toString());
		   } 
		   System.out.println("TRUCKS BY MAKE");
		   
		   Collections.sort(trucksList, (truckOne, truckTwo) -> truckOne.getCarMake().compareTo(truckTwo.getCarMake()));
		     
		   for (Truck y: trucksList) {
			   System.out.println(y.toString());
		   }
	 	   System.out.println("TOTAL CAR SALES");
	 	   
	 	   for (Car x: carsList) {
	 		   totalCarSales += x.getSellingPrice();
	 		   System.out.println(totalCarSales);
	 	   }   
	 	   System.out.println("TOTAL TRUCK SALES"); 
	 	   
	 	   for (Truck y: trucksList) {
	 		   totalTruckSales += y.getSellingPrice();
	 		   System.out.println(totalTruckSales);
	 	   }
		   System.out.println("CAR NET PROFIT");
		   
		   for (Car x: carsList) {
			   carNetProfit = x.getSellingPrice() - x.getBuyingPrice();
			   System.out.println(carNetProfit);
		   }
		   
		   System.out.println("TRUCK NET PROFIT");
		   
		   for (Truck y: trucksList) {
			   truckNetProfit = y.getSellingPrice() - y.getBuyingPrice();
			   System.out.println(truckNetProfit);
		   }
		   }	
	}

