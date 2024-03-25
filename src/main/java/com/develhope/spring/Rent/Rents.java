package com.develhope.spring.Rent;

import com.develhope.spring.User.User;
import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "inizio_noleggio")
    private Date startRent;
    @Column(nullable = false, name = "fine_noleggio")
    private Date endRent;
    @Column(nullable = false, name = "noleggio_giornaliero")
    private double dailyRent;
    @Column(nullable = false, name = "giorni_totale_noleggio")
    private double totalRent;
    @Column(nullable = false, name = "pagato")
    private boolean payed;
    @Column(nullable = false, name = "veicolo_noleggiato")
    private String rentedVehicle;
//    @ManyToMany
//    private List<Vehicles> vehiclesList;
//	@ManyToOne
//	private User users;
}
