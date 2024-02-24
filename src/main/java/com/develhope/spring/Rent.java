package com.develhope.spring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rent {
@Column(nullable = false, name = "inizio_noleggio")
Date startRent;
@Column(nullable = false, name = "fine_noleggio")
Date endRent;
@Column(nullable = false, name = "noleggio_giornaliero")
double dailyRent;
@Column(nullable = false, name = "giorni_totale_noleggio")
double totalRent;
@Column(nullable = false, name = "pagato")
boolean payed;
@Column(nullable = false, name = "veicolo_noleggiato")
String rentedVehicle;
}
