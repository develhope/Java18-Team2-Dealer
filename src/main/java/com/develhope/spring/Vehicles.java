package com.develhope.spring;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, name = "tipo di veicolo")
	private String type;
	@Column(nullable = false, name = "marchio")
	private String brand;
	@Column(nullable = false, name = "modello")
	private String model;
	@Column(nullable = false, name = "cilindrata")
	private Integer displacement;
	@Column(nullable = false, name = "colorazione")
	private String color;
	@Column(nullable = false, name = "potenza")
	private String power;
	@Column(nullable = false, name = "trasmissione")
	private String transmissionType;
	@Column(nullable = false, name = "anno di registrazione")
	private Integer yearOfRegistration;
	@Column(nullable = false, name = "carburante")
	private String fuelType;
	@Column(nullable = false, name = "prezzo")
	private double price;
	@Column(nullable = false, name = "prezzo scontato")
	private double discountPrice;
	@Column(nullable = false, name = "accessori")
	private String accessories;
	@Column(nullable = false, name = "condizioni")
	private String condition;
	@Column(nullable = false, name = "disponibilità")
	private boolean available;


	public Vehicles(Long id, String type, String brand, String model, Integer displacement, String color, String power, String transmissionType, Integer yearOfRegistration, String fuelType, int price, int discountPrice, String accessories, String condition, boolean available) {
	}
}
