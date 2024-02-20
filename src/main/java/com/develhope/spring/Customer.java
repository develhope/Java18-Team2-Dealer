package com.develhope.spring;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Vehicles> vehiclesList = new ArrayList<>();

    public void addVehicles(Vehicles vehicles){
        vehiclesList.add(vehicles);

    }


}
