package com.develhope.spring.Vehicles.EntityofVehicles;

public enum Status {
    DISPONIBILE("Disponibile"),
    NON_DISPONIBILE("Non disponibile"),
    NOLEGGIABILE("Noleggibile"),
    ORDINABILE("Ordinable"),
    ACQUISTABILE("Acquistabile");

    private String string;
    Status(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return this.string;
    }
}