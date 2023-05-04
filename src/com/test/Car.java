package com.test;
// Class is a template to create an Objects
public class Car {
	String color;
	String model;
	int milage;
	int cost;
	
	public void startCar() 
	{
		System.out.println(model+" car started");
	}
	public void stopCar() 
	{
		System.out.println(model+" car stoped");
	}
	public void carDetails() 
	{
		System.out.println("color of the car is : "+color);
		System.out.println("model of the car is : "+model);
		System.out.println("milage of the car is : "+milage);
		System.out.println("cost of the car is : "+cost);
	}

}
