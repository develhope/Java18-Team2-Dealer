package com.develhope.spring;

public class Vehicles {

	private String type;
	private String brand;
	private String model;
	private Integer displacement;
	private String color;
	private Integer power;
	private String transmissionType;
	private Integer yearOfRegistration;
	private String fuelType;
	private int price;
	private int discountPrice;
	private String accessories;
	private boolean condition;
	private boolean available;

	public Vehicles(String type, String brand, String model, Integer displacement, String color, Integer power, String transmissionType,
	                Integer yearOfRegistration, String fuelType, int price, int discountPrice, String accessories, boolean condition, boolean available) {
		this.brand = brand;
		this.model = model;
		this.displacement = displacement;
		this.color = color;
		this.power = power;
		this.transmissionType = transmissionType;
		this.yearOfRegistration = yearOfRegistration;
		this.fuelType = fuelType;
		this.price = price;
		this.discountPrice = discountPrice;
		this.accessories = accessories;
		this.condition = condition;
		this.available = available;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getDisplacement() {
		return displacement;
	}

	public void setDisplacement(Integer displacement) {
		this.displacement = displacement;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public Integer getYearOfRegistration() {
		return yearOfRegistration;
	}

	public void setYearOfRegistration(Integer yearOfRegistration) {
		this.yearOfRegistration = yearOfRegistration;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getAccessories() {
		return accessories;
	}

	public void setAccessories(String accessories) {
		this.accessories = accessories;
	}

	public boolean isCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Vehicles{" +
				"type='" + type + '\'' +
				", brand='" + brand + '\'' +
				", model='" + model + '\'' +
				", displacement=" + displacement +
				", color='" + color + '\'' +
				", power=" + power +
				", transmissionType='" + transmissionType + '\'' +
				", yearOfRegistration=" + yearOfRegistration +
				", fuelType='" + fuelType + '\'' +
				", price=" + price +
				", discountPrice=" + discountPrice +
				", accessories='" + accessories + '\'' +
				", condition=" + condition +
				", available=" + available +
				'}';
	}
}
