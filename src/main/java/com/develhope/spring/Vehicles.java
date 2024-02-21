package com.develhope.spring;

import jakarta.persistence.*;

@Entity
@Table
public class Vehicles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, name = "Tipo di veicolo")
	private String type;
	@Column(nullable = false, name = "Marchio")
	private String brand;
	@Column(nullable = false, name = "Modello")
	private String model;
	@Column(nullable = false, name = "Cilindrata")
	private Integer displacement;
	@Column(nullable = false, name = "Colorazione")
	private String color;
	@Column(nullable = false, name = "Potenza")
	private String power;
	@Column(nullable = false, name = "Trasmissione")
	private String transmissionType;
	@Column(nullable = false, name = "Anno di registrazione")
	private Integer yearOfRegistration;
	@Column(nullable = false, name = "Carburante")
	private String fuelType;
	@Column(nullable = false, name = "Prezzo")
	private int price;
	@Column(nullable = false, name = "Prezzo scontato")
	private int discountPrice;
	@Column(nullable = false, name = "Accessori")
	private String accessories;
	@Column(nullable = false, name = "Condizioni")
	private boolean condition;
	@Column(nullable = false, name = "Disponibilità")
	private boolean available;

	public Vehicles(Long id, String type, String brand, String model, Integer displacement, String color, String power, String transmissionType,
	                Integer yearOfRegistration, String fuelType, int price, int discountPrice, String accessories, boolean condition, boolean available) {
		this.id = id;
		this.type = type;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
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
