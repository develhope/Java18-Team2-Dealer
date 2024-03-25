package com.develhope.spring.Vehicles.EntityofVehicles;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table
@Getter
@Setter
public class VehiclesDTO {
    private Vehicles vehicles;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, name = "tipo")
    private VehicleType type;
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
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "status")
    private Status status;

    public VehiclesDTO() {
    }

    public VehiclesDTO(Vehicles vehicles, Long id, VehicleType type, String brand, String model, Integer displacement, String color, String power, String transmissionType, Integer yearOfRegistration, String fuelType, double price, double discountPrice, String accessories, String condition, Status status) {
        this.vehicles = vehicles;
        this.id = vehicles.getId();
        this.type = vehicles.getType();
        this.brand = vehicles.getBrand();
        this.model = vehicles.getModel();
        this.displacement = vehicles.getDisplacement();
        this.color = vehicles.getColor();
        this.power = vehicles.getPower();
        this.transmissionType = vehicles.getTransmissionType();
        this.yearOfRegistration = vehicles.getYearOfRegistration();
        this.fuelType = vehicles.getFuelType();
        this.price = vehicles.getPrice();
        this.discountPrice = vehicles.getDiscountPrice();
        this.accessories = vehicles.getAccessories();
        this.condition = vehicles.getCondition();
        this.status = vehicles.getStatus();
    }
}
