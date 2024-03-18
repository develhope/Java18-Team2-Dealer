package com.develhope.spring.Purchase;

import com.develhope.spring.User.User;
import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Vehicle,
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPurchase;
    @Column(nullable = false, name = "deposito")
    private int deposit;
    @Column(nullable = false, name = "pagato")
    private boolean payed;
    @Column(nullable = false, name = "stato_ordine")
    private String status;
    @Column(nullable = false, name = "ordinato/venduto")
    private boolean isSelled;
    @ManyToMany
    private List <Vehicles> vehicleList;
    @ManyToOne
    private User users;
}
