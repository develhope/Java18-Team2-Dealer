package com.develhope.spring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    @Column(nullable = false, name = "deposito")
    int deposit;
    @Column(nullable = false, name = "pagato")
    boolean payed;
    @Column(nullable = false, name = "stato_ordine")
    String status;
    @Column(nullable = false, name = "ordinato/venduto")
    String orderOrSell;
}
