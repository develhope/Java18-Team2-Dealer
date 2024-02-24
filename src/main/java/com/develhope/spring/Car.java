package com.develhope.spring;

public class Car extends Vehicles{
	public Car(Long id, String type,String brand, String model, Integer displacement, String color, String power, String transmissionType, Integer yearOfRegistration, String fuelType, int price, int discountPrice, String accessories, String condition, boolean available) {
		super(id, type ,brand, model, displacement, color, power, transmissionType, yearOfRegistration, fuelType, price, discountPrice, accessories, condition, available);
	}
}
